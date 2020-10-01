package Lessons.Lesson10;

import java.util.Scanner;


public class USDollarConverter {

    public static void UStoCad(double usDollar) {
        Scanner sc = new Scanner(System.in);
        double caddollar = usDollar * 1.32;
        System.out.println("You have " + caddollar + " in CAD $$$.");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how much money you have");
        double usDollar = sc.nextDouble();
        UStoCad(usDollar);

    }
}
