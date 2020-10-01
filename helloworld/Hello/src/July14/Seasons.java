package July14;

import java.util.Scanner;

public class Seasons {


    private static void printSummer() {
        System.out.println("Better pack your mosquito spray and sun tan, summer is here!");

    }

    private static void printSpring() {
        System.out.println("Spring is on the way");

    }

    private static void printWinter() {
        System.out.println("She's gonna be minus 50 for the next three months, winter is here.");
        }

    private static void printFall() {
        System.out.println("Pull your sweaters out of the closet and put on that pumpkin lattee, fall is here!");
    }

    public static void main(String[] args) {


        System.out.println("Please enter a number 1-4");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        if (answer == 1)  {
            printSpring();
            if (answer == 2)
                printWinter();
            if (answer == 3)
                printFall();
            if (answer == 4) ;
            printSummer();
        } else System.out.println("please make another selection.");


        }

    }




