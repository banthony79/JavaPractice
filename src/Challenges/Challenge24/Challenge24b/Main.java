package Challenges.Challenge24.Challenge24b;

import java.util.Scanner;
import java.util.*;


public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scanner2 = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printOptions();
        while (!quit) {
            System.out.println("Please choose from the following options");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    mobilePhone.displayContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    searchforContact();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void addContact() {
        System.out.println("Please enter contact name");
        String contactName = scanner.nextLine();
        ;
        System.out.println("Please enter contact number");
        String contactNumber = scanner.nextLine();
        if (!mobilePhone.exists(contactName, contactNumber)) {
            mobilePhone.addPhoneNumber(contactNumber);
            mobilePhone.addName(contactName);
        } else {
            System.out.println("That contact already exists");
            addContact();

        }

    }

    public static void searchforContact() {
        int choice = 0;
        System.out.println("How do you want to search?");
        System.out.println("\r 1. By Name");
        System.out.println("\r 2. By Phone Number");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Please enter name");
                String name = scanner.nextLine();
                if (mobilePhone.findName(name) >= 0) {
                    System.out.println(name + " exists at position " +
                            mobilePhone.findName(name) + 1);
                } else {
                    System.out.println("The name does not exist");
                }
                break;
            case 2:
                System.out.println("Please enter number");
                String number = scanner.nextLine();
                scanner.nextLine();
                if (mobilePhone.findNumber(number) >= 0) {
                    System.out.println(number + "exists at position :" +
                            mobilePhone.findNumber(number) + 1);
                } else {
                    System.out.println("The number does not exist");
                }
        }
    }

    public static void deleteContact() {
        System.out.println("Please enter the name of the contact you would like to remove");
        String contactName = scanner.nextLine();
        mobilePhone.removeContactByName(contactName);

    }

    public static void modifyContact() {
        int choice = 0;
        System.out.println("Would you like to ");
        System.out.println("\r 1. Edit Contact Name");
        System.out.println("\r 2. Edit Contact Phone Number");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter name that you would like to edit");
                String oldName = scanner2.nextLine();
                scanner.nextLine();
                System.out.println("Please enter new name");
                String newName = scanner.nextLine();
                scanner.nextLine();
                mobilePhone.modifyContactName(oldName, newName);
                break;
            case 2:
                System.out.println("Please enter name that you would like to edit");
                String name = scanner2.nextLine();
                scanner.nextLine();
                System.out.println("Please enter new number");
                String newNumber = scanner.nextLine();
                scanner.nextLine();
                mobilePhone.modifyContactNumber(name, newNumber);
                break;
        }
    }

    public static void printOptions() {

        System.out.println("\r 1: Display Contacts");
        System.out.println("\r 2: Add a Contact");
        System.out.println("\r 3: Remove a Contact");
        System.out.println("\r 4: Modify a Contact");
        System.out.println("\r 5: Search for Contact");
        System.out.println("\r 6: Quit");
    }


}