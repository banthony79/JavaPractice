package PersonalStuff.CityDistance;


import java.util.LinkedList;

public class CityList {

    private LinkedList<City> citylinkedList = new LinkedList<>();

    public LinkedList<City> getCitylinkedList() {
        return citylinkedList;
    }

    public City findCity(String cityName) {
        for (City checkedCity : citylinkedList) {
            if (checkedCity.getCityName().equals(cityName)) {
                return checkedCity;
            }
        }
        return null;
    }

    public int findCityInt(String cityName) {
        for (int i = 0; i < citylinkedList.size(); i++) {
            if (citylinkedList.get(i).getCityName().equals(cityName)) {
                return i;
            }
        }
        return -1;
    }

    public double calculateDistance(City cityA, City cityB) {
        double lat1 = Math.toRadians(cityA.getLatitute());
        double lon1 = Math.toRadians(cityA.getLongitude());
        double lat2 = Math.toRadians(cityB.getLatitute());
        double lon2 = Math.toRadians(cityB.getLongitude());

        double earthRadius = 6371.01; //kms

        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

    }

    public boolean addCity(String cityName, String country, double latitute, double longitude) {
        if (findCity(cityName) == null) {
            citylinkedList.add(new City(cityName, country, latitute, longitude));
            return true;
        } else return false;
    }


}
