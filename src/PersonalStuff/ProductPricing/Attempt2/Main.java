package PersonalStuff.ProductPricing.Attempt2;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Scanner sc = new Scanner(System.in);
    public static Pricing pricing = new Pricing();
    private static String[] townArray = {"North Saskatoon", "West Saskatoon", "North East Saskatoon",
            "East Saskatoon", "Martensville", "Warman", "Langham", "Allan", "Dundurn", "Vanscoy", "Asquith", "Osler"};

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        while (!quit) {
            listOptions();
            System.out.println("Please make a selections");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    freight();
                    break;
                case 2:
                    customFreight();
                    break;
                case 3:
                    listZones();
                    break;
                case 4:
                    quit = true;
                    break;

            }
        }

    }

    public static void freight() {
        System.out.println("Please enter product price");
        double productPrice = scanner.nextDouble();
        System.out.println("Please enter four digit pit code");
        int pitNumber = scanner.nextInt();

        System.out.println("Please select zone");
        int zone = scanner.nextInt();
        double haulrate = pricing.pitNumbers(pitNumber, zone);
        double deliveredprice = pricing.priceCalulator(productPrice, (pricing.pitNumbers(pitNumber, zone)));
        double deliveredpriceaddfreight = pricing.pricingNoDeduction(productPrice, (pricing.pitNumbers(pitNumber, zone)));
        double pitDiscountDeliveredPrice = pricing.pricingNoDeduction
                (productPrice, pricing.pitNumbers(pitNumber, zone) - pricing.pitNumberDiscount(pitNumber));
        System.out.println("Location: " + townArray[zone - 1]);
        System.out.println("Product Price: $" + String.format("%.2f", productPrice));
        if (haulrate == 0) {
            System.out.println("No haul rate is set up for that location");
        } else {
            System.out.println("Freight Rate: $" + String.format("%.2f", haulrate));
            System.out.println("Price with freight added and pit discount applied: $" +
                    String.format("%.2f", pitDiscountDeliveredPrice));
            System.out.println("Price with freight added and no pit discount applied: $"
                    + String.format("%.2f", deliveredpriceaddfreight));
            System.out.println("Price with freight deducted: $" + String.format("%.2f", deliveredprice));

            pressEntertoContinue();

        }
    }


    public static void customFreight() {
        System.out.println("Please product price");
        double productPrice = scanner.nextDouble();
        System.out.println("Please enter distance in kilometers");
        int kms = scanner.nextInt();
        System.out.println("Please enter haul rate per kilometer");
        double ratePerKm = scanner.nextDouble();
        System.out.println("Haul rate: $" + String.format("%.2f", pricing.freighRateCalculator(kms, ratePerKm)));
        System.out.println("Pricing with haul rate added: $" + String.format("%.2f", productPrice +
                pricing.freighRateCalculator(kms, ratePerKm)));
        if (pricing.freighRateCalculator(kms, ratePerKm) < 0) {
            System.out.println("Price less than zero - invalid price");
            pressEntertoContinue();
        } else {
            System.out.println("Pricing with haul rate deducted: $" + String.format("%.2f", (productPrice -
                    pricing.freighRateCalculator(kms, ratePerKm))));
            pressEntertoContinue();

        }
    }

    public static void listZones() {

        System.out.println("\t 1.   NorthWest Saskatoon");
        System.out.println("\t 2.   SouthWest Saskatoon");
        System.out.println("\t 3.   NorthEast Saskatoon");
        System.out.println("\t 4.   SouthEast Saskatoon");
        System.out.println("\t 5.   Martensville");
        System.out.println("\t 6.   Warman");
        System.out.println("\t 7.   Langham");
        System.out.println("\t 8.   Allan");
        System.out.println("\t 9.   Dundurn");
        System.out.println("\t 10.  Vanscoy");
        System.out.println("\t 11.  Osler");
        System.out.println("\t 11.  Delilse");
        pressEntertoContinue();

    }

    public static void listOptions() {
        System.out.println("\t 1. Calculate pricing");
        System.out.println("\t 2. Calculate custom freight rate and delivered price");
        System.out.println("\t 3. List Zones");
        System.out.println("\t 4. Quit");

    }

    public static void pressEntertoContinue() {
        System.out.println("Press enter to continue");
        sc.nextLine();
    }
}



