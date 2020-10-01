package PersonalStuff.ShoppingList;

import java.util.Scanner;

public class Main {

    public static List list = new List("Bryce");

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printOptions();
        boolean isNumber = scanner.hasNextInt();
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Please make selection.");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(list.getOwner() + "'s" + " list.");
                    list.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    deleteItem();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }


    public static void addItem() {
        System.out.println("Please enter name of item");
        String name = scanner.nextLine();
        System.out.println("Enter price of item");
        Double itemPrice = scanner.nextDouble();
        if (list.addItem(name, itemPrice)) {
            System.out.println(name + " has been successfully added");
        } else {
            System.out.println("Error");
        }


    }


    public static void deleteItem() {
        System.out.println("Please enter the name of item you want to remove");
        String name = scanner.nextLine();
        list.removeItem(name);
    }

    public static void printOptions() {
        System.out.println("1. List Options");
        System.out.println("2. Add a Item");
        System.out.println("3. Remove a Item");
        System.out.println("4. Quit");
    }
}
