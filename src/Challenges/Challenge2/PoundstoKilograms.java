package Challenges.Challenge2;

import java.util.Scanner;

public class PoundstoKilograms {

    public static void main(String[] args) {

        System.out.println("Please enter the weight in kgs");
        Scanner sc = new Scanner(System.in);
        double kg = sc.nextDouble();
        double pounds = kg / .45359237;

        System.out.println("The weight in pounds is " + pounds + " lbs.");
    }
}
