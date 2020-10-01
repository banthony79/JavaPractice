package Challenges.Challenge22;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] enterIntegers(int count) {
        int[] numArray = new int[count];
        System.out.println("Please enter numbers");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return numArray;
    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] bryceArray = enterIntegers(count);
        System.out.println("The min value of your array is " + getMinValue(bryceArray));
        System.out.println("The max value of your array is " + getMaxValue(bryceArray));

    }
}

