package JavaChallenges;

//Write a Java program to compare two numbers

import java.util.Scanner;

public class Compare2Numbers {

    public static int CompareTwoNumbers(int num1, int num2) {
        if (num1 < num2) System.out.println(num1 + " is less than " + num2);
        if (num1 == num2) System.out.println(num1 + " is equal to " + num2);
        if (num1 > num2) System.out.println(num1 + " is greater than " + num2);
        if (num1 != num2) System.out.println(num1 + " is not equal to " + num2);
        return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        CompareTwoNumbers(num1, num2);
    }
}