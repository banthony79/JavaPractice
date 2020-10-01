package PersonalStuff.CityDistance;

import java.util.*;

public class Main {

    public static ArrayList<City> itineary = new ArrayList<City>();
    public static Scanner scanner = new Scanner(System.in);

    public static CityList cityList = new CityList();

    public static void main(String[] args) {

        cityList.addCity("Berlin", "Germany", 52.30, 13.25);
        cityList.addCity("Paris", "France", 48.50, 02.20);
        cityList.addCity("Ottawa", "Canada", 45.27, 75.42);
        cityList.addCity("Santiago", "Chile", 33.24, 70.40);
        cityList.addCity("Beijing", "China", 39.55, 116.20);
        cityList.addCity("Helsinki", "Finland", 60.15, 25.03);
        cityList.addCity("New Dehli", "India", 28.37, 77.13);
        cityList.addCity("Kabul", "Afghanistan", 34.28, 69.11);
        cityList.addCity("Canberra", "Australia", 35.15, 149.08);
        cityList.addCity("Vienna", "Austria", 48.12, 16.22);
        cityList.addCity("Nassau", "Bahamas", 25.05, 77.20);
        cityList.addCity("Minsk", "Belarus", 53.25, 27.30);
        cityList.addCity("Havana", "Cuba", 23.08, 82.22);
        cityList.addCity("Prague", "Czech Republic", 50.05, 14.22);
        cityList.addCity("Copenhagen", "Denmark", 55.41, 12.34);
        cityList.addCity("Cairo", "Egypt", 30.01, 31.14);
        cityList.addCity("Athens", "Greece", 37.58, 23.46);
        cityList.addCity("Dublin", "Ireland", 53.21, 06.15);
        cityList.addCity("Jerusalem", "Israel", 31.71, 35.10);
        cityList.addCity("Nairobi", "Kenya", 01.17, 36.48);
        cityList.addCity("Kuala Lumpur", "Malaysia", 03.09, 101.41);
        cityList.addCity("Mexico", "Mexico", 19.20, 99.10);
        cityList.addCity("Amsterdam", "Netherlands", 52.23, 04.54);
        cityList.addCity("Wellington", "New Zeland", 41.19, 174.46);
        cityList.addCity("Pyongyang", "North Korea", 39.09, 125.30);
        cityList.addCity("Lisbon", "Portugal", 38.42, 09.10);
        cityList.addCity("Warsaw", "Poland", 52.13, 21);
        cityList.addCity("Seoul", "South Korea", 37.31, 126.58);
        cityList.addCity("Manila", "Phillippines", 14.40, 121.03);
        cityList.addCity("Madrid", "Spain", 14.40, 121.03);
        cityList.addCity("Stockholm", "Sweden", 59.20, 18.03);
        cityList.addCity("Bern", "Switzerland", 46.57, 07.28);
        cityList.addCity("Bangkok", "Thailand", 13.45, 100.35);
        cityList.addCity("Taipei", "Taiwan", 25.03, 121.56);
        cityList.addCity("Saskatoon", "Canada", 52.13, 106.67);
        cityList.addCity("Calgary", "Canada", 51.04, 114.07);
        cityList.addCity("Keiv", "Ukraine", 50.30, 30.28);
        cityList.addCity("London", "UK", 51.36, 00.05);
        cityList.addCity("Washington", "USA", 39.91, 77.02);


        boolean quit = false;
        int choice = 0;
        listOptions();
        while (!quit) {
            System.out.println("Please make a selection");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:
                    displayCities(cityList.getCitylinkedList());
                    break;
                case 2:
                    System.out.println("How many cities would you like to travel to, max 10");
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    itineraryList(option);
                    calcuateDistanceLoop(itineary);
                    break;
                case 3:
                    quit = true;
            }
        }


    }


    public static void itineraryList(int howManyCities) {

        System.out.println("Please enter " + howManyCities + " city name");
        for (int i = 0; i < howManyCities; i++) {
            String cityName = scanner.nextLine();

            if (howManyCities > 10) {
                System.out.println("Too many cities");
            } else {
                if (cityList.findCityInt(cityName) >= 0) {
                    itineary.add(cityList.findCity(cityName));
                } else {
                    System.out.println("City not found");
                }
            }
        }


    }

    public static void displayCities(LinkedList<City> cityLinkedList) {
        Iterator<City> i = cityLinkedList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("===============");
    }


    public static void listOptions() {
        System.out.println("1. Display Cities \n 2. Go on a trip! \n 3. Quit");
    }


    public static void calcuateDistanceLoop(ArrayList<City> itList) {
        double distanceTravelled = 0;
        for (int i = 0; i < itList.size(); i++) {
            distanceTravelled = (long) distanceTravelled + cityList.calculateDistance
                    (itList.get(i), itList.get(itList.size() - 1));
            if (i == 0) {
                System.out.println("Your first destination is " + itList.get(0).getCityName() + " in "
                        + itList.get(0).getCountry());
            }

            if (i == 1) {
                System.out.println("Now travelling to " + itList.get(1).getCityName() + " in " +
                        itList.get(1).getCountry() + " for a distance of "
                        + String.format("%.2f", cityList.calculateDistance(itList.get(0), itList.get(1))) + " kms");
            }

            if (i > 1 && i <= itList.size() - 2) {
                System.out.println("Now travelling to " + itList.get(i).getCityName() + " in " +
                        itList.get(i).getCountry() + " for a distance of "
                        + String.format("%.2f", cityList.calculateDistance(itList.get(i - 1), itList.get(i))) + " kms");
            }

            if (i == itList.size() - 1) {
                System.out.println("Now travelling to " + itList.get(i).getCityName() + " in " +
                        itList.get(i).getCountry() + " for a distance of "
                        + String.format("%.2f", cityList.calculateDistance(itList.get(itList.size() - 1), itList.get(itList.size() - 2))) + " kms");

            }

            if (i == itList.size() - 1) {
                System.out.println("You have arrived at your final destination at "
                        + itList.get(i).getCityName() + " and travelled a total distance of " + String.format("%.2f", distanceTravelled) + " kms");
            }


        }


    }
}





