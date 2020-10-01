package JavaChallenges;

import java.util.Scanner;

public class DigitDigitDigit {


    public static int SumofNumbers(int num) {
        if (num >= 10) {
            System.out.println("The number must be under 10");
            return -1;
        }
        int firstNumber = num * 11;
        int secondNumber = num * 111;
        int sum = firstNumber + secondNumber + num;
        System.out.println(num + " + " + firstNumber + " + " + secondNumber + " = " + sum);
        return num;
    }

    public static void main(String[] args) {
        SumofNumbers(5);
        SumofNumbers(10);
        SumofNumbers(8);

    }
}



