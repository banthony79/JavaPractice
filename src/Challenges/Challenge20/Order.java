package Challenges.Challenge20;


import java.util.Scanner;

public class Order {


    public static void BaseBurgerOrder() {


        BaseHamburger burger = new BaseHamburger("Burger", "sesame", 1);


        Scanner addScanner2 = new Scanner(System.in);
        String j = "How many would you like?";
        Scanner addScanner = new Scanner(System.in);
        int numberChoice = 0;
        String c = "";

        do {
            System.out.println("Would you like any additions \n" + "1. Extra Patty \n" +
                    "2. Lettuce \n" + "3. Tomatoes \n" +
                    "4. Onions \n" + "5. Cheese Patties \n" + "Please make your selection");
            int addChoice = addScanner.nextInt();
            if (addChoice == 1) {
                System.out.println("You have chosen meat");
                System.out.println(j);
                numberChoice = addScanner2.nextInt();
                burger.addMeat(numberChoice);
                System.out.println("You have added " + numberChoice + " patties.");
            } else if (addChoice == 2) {
                System.out.println("You have chosen lettuce");
                System.out.println(j);
                numberChoice = addScanner2.nextInt();
                burger.addLettuce(numberChoice);
                System.out.println("You have added " + numberChoice + " peices of lettuce");
            } else if (addChoice == 3) {
                System.out.println("You have chosen tomatoes");
                System.out.println(j);
                numberChoice = addScanner2.nextInt();
                burger.addTomatos(numberChoice);
                System.out.println("You have added " + numberChoice + " slices of tomatoes");
            } else if (addChoice == 4) {
                System.out.println("You have chosen onions.");
                System.out.println(j);
                numberChoice = addScanner2.nextInt();
                System.out.println("You have added " + numberChoice + " slices of onions");
                burger.addOnions(numberChoice);
            } else if (addChoice == 5) {
                System.out.println("You have chosen cheese.");
                System.out.println(j);
                numberChoice = addScanner2.nextInt();
                burger.addCheese(numberChoice);
                System.out.println("You have added " + numberChoice + " slices of cheese");
            } else {
                System.out.println("Invalid Entry");
            }

            System.out.println("Would you like to add more?");
            Scanner kontinue = new Scanner(System.in);
            c = kontinue.next();
        } while (c.equalsIgnoreCase("Y"));

        double baseBurgerPrice = burger.getPrice();
        System.out.println("Your Price is " + baseBurgerPrice);

    }


    public static void HealthyBurgerOrder() {

        HealthyHamburger healthyBurger = new HealthyHamburger();

        String j = "How many would you like?";
        Scanner addScanner = new Scanner(System.in);
        Scanner addScanner2 = new Scanner(System.in);
        int numberChoice = 0;
        String c = "";
        do {
            System.out.println("Would you like any additions \n" + "1. Extra Guac \n" +
                    "2. Extra Cucumbers \n" + "Please make your selection");
            int addChoice = addScanner.nextInt();
            if (addChoice == 1) {
                System.out.println("You have chosen extra guac");
                System.out.println(j);
                numberChoice = addScanner2.nextInt();
                healthyBurger.addGuac(numberChoice);
                System.out.println("You have added " + addChoice + " time the guac");
            } else if (addChoice == 2) {
                System.out.println("You have chosen extra cucumbers");
                System.out.println(j);
                numberChoice = addScanner2.nextInt();
                healthyBurger.addGuac(numberChoice);
                System.out.println("You have added " + addChoice + " slices of cucumbers");
            } else {
                System.out.println("Invalid Choice");
            }

            System.out.println("Would you like to continue?");
            Scanner kontinue = new Scanner(System.in);
            c = kontinue.next();
        } while (c.equalsIgnoreCase("Y"));

        double healthyBurgerPrice = healthyBurger.getPrice();
        System.out.println("Your Price is " + healthyBurgerPrice);
    }

    public static void DeluxeHamburgerOrder() {
        DeluxeHamburger deluxeBurger = new DeluxeHamburger();
        double deluxeBurgerPrice = deluxeBurger.getPrice();
        System.out.println("Your price is " + deluxeBurgerPrice);

    }

    public static void order() {


        String c = "";
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please place your order: \n" +
                    "1. Normal Hamburger \n" +
                    "2. Healthy Burger \n" +
                    "3. Deluxe Burger w/ chips and pop \n");
            int choice = input.nextInt();
            if (choice == 1) {
                Order.BaseBurgerOrder();
            } else if (choice == 2) {
                Order.HealthyBurgerOrder();
            } else if (choice == 3) {
                Order.DeluxeHamburgerOrder();
            }

            System.out.println("Would you like to make another selection?");
            Scanner kontinue = new Scanner(System.in);
            c = kontinue.next();
        } while (c.equalsIgnoreCase("Y"));

        //System.out.println("Your total is " + orderTotal());


    }
}


