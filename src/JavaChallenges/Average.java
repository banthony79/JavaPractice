package JavaChallenges;

// Write a Java program that takes three numbers as input to calculate and print the average of the numbers

import java.util.Scanner;

public class Average {

    public static void AverageofThreeNumbers(double num1, double num2, double num3) {
        System.out.println("The average of your numbers is " + (num1 + num2 + num3) / 3);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        AverageofThreeNumbers(num1, num2, num3);
    }
}