package Challenges.Challenge23;

//reverse an array

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    private static Scanner scanner = new Scanner(System.in);

    private static int[] enterNumbers(int count) {
        int[] array = new int[count];
        System.out.println("Please enter " + count + " numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static void reverse(int[] array) {
        int[] originalArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            originalArray[i] = array[i];
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Reverse array: " + Arrays.toString(array));
    }


    public static void main(String[] args) {
        System.out.println("Please enter count");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] bryceArray = new int[count];
        bryceArray = enterNumbers(count);
        reverse(bryceArray);


    }


}
