package PersonalStuff.LinkedList.ArrayListPractice;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static Directory directory = new Directory();

    public static void main(String[] args) {

        boolean quit = false;
        showOptions();
        while (!quit) {
            System.out.println("Please make a selection");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    deleteCustomer();
                    break;
                case 3:
                    directory.showCustomers();
                    break;
                case 4:
                    quit = true;
                    break;

            }
        }

    }

    public static void showOptions() {
        System.out.println("1.\t Add Customer \n2.\t Delete customer \n3.\t Show Customers \n 4. \t Quit ");
    }

    public static void addCustomer() {
        System.out.println("Please enter customer name");
        String customerName = scanner.nextLine();
        System.out.println("Please enter balance");
        double balance = scanner.nextDouble();
        if (directory.addCustomer(customerName, balance)) {
            System.out.println(customerName + " added successfully");
        } else {
            System.out.println(customerName + " already exists");
        }
    }

    public static void deleteCustomer() {
        System.out.println("Please enter customer name");
        String removalName = scanner.nextLine();
        if (directory.removeCustomer(removalName)) {
            System.out.println(removalName + " removed successfully");
        } else {
            System.out.println("Customer does not exist");
        }

    }


}
