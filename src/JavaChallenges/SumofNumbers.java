package JavaChallenges;

import java.util.Scanner;

//Create a method that takes two integers as arguments and return their sum.

public class SumofNumbers {

    public static void SumofTwoNumbers(int number1, int number2) {
        int sum = (number1 + number2);
        System.out.println("The sum of the two numbers is " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = sc.nextInt();
        System.out.println("Please enter second number");
        int number2 = sc.nextInt();
        SumofTwoNumbers(number1, number2);
    }

}

