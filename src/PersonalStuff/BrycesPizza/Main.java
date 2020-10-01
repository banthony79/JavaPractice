package PersonalStuff.BrycesPizza;

import Lessons.Lesson38.Password;

import java.util.Scanner;

public class Main {

    private static Restaurant restaurant = new Restaurant("Bryces Pizza");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Pizza pizza = new Pizza("Ham and Pineapple", 1);
        restaurant.getMenu().addItem(pizza);
        pizza.makePizza(Pizza.Crust.REGULAR, Pizza.Size.LARGE);
        pizza.addTopping(Pizza.Topping.HAM, Pizza.Topping.PINEAPPLE);

        pizza = new Pizza("Pepperoni", 2);
        restaurant.getMenu().addItem(pizza);
        pizza.makePizza(Pizza.Crust.REGULAR, Pizza.Size.LARGE);
        pizza.addTopping(Pizza.Topping.PEPPERONI);

        pizza = new Pizza("Pepperoni & Mushroom", 3);
        restaurant.getMenu().addItem(pizza);
        pizza.makePizza(Pizza.Crust.REGULAR, Pizza.Size.LARGE);
        pizza.addTopping(Pizza.Topping.PEPPERONI, Pizza.Topping.MUSHROOMS);

        pizza = new Pizza("Meat Lovers", 4);
        restaurant.getMenu().addItem(pizza);
        pizza.makePizza(Pizza.Crust.REGULAR, Pizza.Size.LARGE);
        pizza.addTopping(Pizza.Topping.HAM, Pizza.Topping.SAUSAGE, Pizza.Topping.BACON, Pizza.Topping.PEPPERONI);

        pizza = new Pizza("Cheese", 5);
        restaurant.getMenu().addItem(pizza);
        pizza.makePizza(Pizza.Crust.REGULAR, Pizza.Size.LARGE);
        pizza.addTopping(Pizza.Topping.CHEESE);

        pizza = new Pizza("Canadian Pizza", 6);
        restaurant.getMenu().addItem(pizza);
        pizza.makePizza(Pizza.Crust.REGULAR, Pizza.Size.LARGE);
        pizza.addTopping(Pizza.Topping.HAM, Pizza.Topping.BACON);

        pizza = new Pizza("Sausage", 7);
        restaurant.getMenu().addItem(pizza);
        pizza.makePizza(Pizza.Crust.REGULAR, Pizza.Size.LARGE);
        pizza.addTopping(Pizza.Topping.SAUSAGE, Pizza.Topping.PINEAPPLE);

        Wing wing = new Wing("BBQ Wings", 8, Wing.Flavour.BBQ);
        restaurant.getMenu().addItem(wing);

        wing = new Wing("Hot Wings", 9, Wing.Flavour.HOT);
        restaurant.getMenu().addItem(wing);

        wing = new Wing("Lemon Pepper", 10, Wing.Flavour.LEMON_PEPPER);
        restaurant.getMenu().addItem(wing);

        wing = new Wing("Ranch", 11, Wing.Flavour.RANCH);
        restaurant.getMenu().addItem(wing);

        wing = new Wing("Teriyaki", 12, Wing.Flavour.TERIYAKI);
        restaurant.getMenu().addItem(wing);

        wing = new Wing("Salt and Pepper", 13, Wing.Flavour.SALT_AND_PEPPER);
        restaurant.getMenu().addItem(wing);


        newOrder();

        //System.out.println(pizza.calculatePrice());


    }

    public static void showMenu() {
        restaurant.getMenu().showMenu();
    }


    public static MenuItem returnItem(int number) {
        MenuItem newItem = restaurant.getMenu().returnItembyNumber(number);
        return newItem;
    }


    public static Pizza returnPizza(int number) {
        MenuItem newItem = restaurant.getMenu().returnItembyNumber(number);
        if (newItem instanceof Pizza) {
            return (Pizza) newItem;
        }
    return null; }

    public static void newOrder() {

        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        Order order = restaurant.makeOrder(name);
        boolean total = false;

        while (!total) {
            System.out.println("Please enter item number, press 0 for total, press 99 for menu");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice !=0) {
                MenuItem orderedItem = returnItem(choice);

                if (orderedItem instanceof Pizza) {
                    Pizza pizzaItem;
                    pizzaItem = returnPizza(choice);
                    System.out.println("You have selected " + pizzaItem.getItemName());
                    scanner.nextLine();
                    pizzaItem.calculatePrice();
                    orderPizza(pizzaItem);
                    System.out.println(pizzaItem.toString());
                    System.out.println("Press enter to add Pizza");
                    scanner.nextLine();
                    howMany(pizzaItem, order);
                } else if (orderedItem instanceof Wing) {
                    MenuItem item = returnItem(choice);
                    System.out.println("You have selected " + item.getItemName());
                    howMany(item, order);
                } else if (choice == 99) {
                    showMenu();
                }
            } else if (choice == 0) {
                total = true;
                System.out.println(order);
            }

        }


    }


    public static void toppingsMenu() {
        System.out.println("1)" + "\t" + "Bacon" + "\n" + "2)" + "\t" + "Mushrooms" +
                "3)" + "\t" + "Pepperoni" + "\n" + "4)" + "\t" + "Green Peppers" + "\n" +
                "5)" + "\t" + "Pineapple" + "\n" + "6)" + "\t" + "Extra Cheese" + "\n" +
                "7)" + "\t" + "Sausage" + "\n" + "8)" + "\t" + "Black Olives" + "\n" + "0)"
                + "\t" + "Done");
    }


    public static void howMany(MenuItem menuItem, Order order) {
        System.out.println("How many would you like?");
        int choice = scanner.nextInt();
        order.setQuantity(choice, menuItem);
    }


    public static void orderPizza(Pizza pizzaItem) {
        System.out.println("What size would you like");
        System.out.println("1) SMALL" + "\n" + "2) MEDIUM" + "\n" + "3) LARGE"
                + "\n" + "4) XTRA LARGE");
        int sizeChoice = scanner.nextInt();
        switch (sizeChoice) {
            case 1:
                pizzaItem.setPizzaSize(Pizza.Size.SMALL);
                break;
            case 2:
                pizzaItem.setPizzaSize(Pizza.Size.MEDIUM);
                break;
            case 3:
                pizzaItem.setPizzaSize(Pizza.Size.LARGE);
                break;
            case 4:
                pizzaItem.setPizzaSize(Pizza.Size.XTRA_LARGE);
                break;
        }
        System.out.println("What type of crust would you like?");
        System.out.println("1) REGULAR" + "\n" + "2) THIN" + "\n" + "3) GLUTEN FREE");
        System.out.println();
        int crustchoice = scanner.nextInt();
        switch (crustchoice) {
            case 1:
                pizzaItem.setPizzaCrust(Pizza.Crust.REGULAR);
                break;
            case 2:
                pizzaItem.setPizzaCrust(Pizza.Crust.THIN);
                break;
            case 3:
                pizzaItem.setPizzaCrust(Pizza.Crust.GLUTEN_FREE);
                break;
        }
        System.out.println("Would you like to add any extra toppings (Y/N)");
        char toppingsChoice = scanner.next().charAt(0);
        System.out.println(toppingsChoice);
        //System.out.println(toppingsChoice);
        if (toppingsChoice == 'Y'  || toppingsChoice == 'y') {

            int option = 1;
            while(option != 0) {
                toppingsMenu();
                System.out.println();
                System.out.println("Select an option");
                option = scanner.nextInt();
                switch(option) {
                    case 1:
                        pizzaItem.addTopping(Pizza.Topping.BACON);
                        System.out.println("Bacon added");
                    case 2:
                        pizzaItem.addTopping(Pizza.Topping.MUSHROOMS);
                        System.out.println("Mushrooms added");
                        break;
                    case 3:
                        pizzaItem.addTopping(Pizza.Topping.PEPPERONI);
                        System.out.println("Pepperoni added");
                        break;
                    case 4:
                        pizzaItem.addTopping(Pizza.Topping.GREEN_PEPPERS);
                        System.out.println("Green Peppers added");
                        break;
                    case 5:
                        pizzaItem.addTopping(Pizza.Topping.PINEAPPLE);
                        System.out.println("Pineapple added");
                        break;
                    case 6:
                        pizzaItem.addTopping(Pizza.Topping.CHEESE);
                        System.out.println("Extra cheese added");
                        break;
                    case 7:
                        pizzaItem.addTopping(Pizza.Topping.SAUSAGE);
                        System.out.println("Sausage added");
                        break;
                    case 8:
                        pizzaItem.addTopping(Pizza.Topping.BLACK_OLIVES);
                        System.out.println("Black olives added");
                        break;
                    case 0:
                        option = 0;
                }
            }


            pizzaItem.calculateToppingsPrice();
        }

    }


}








