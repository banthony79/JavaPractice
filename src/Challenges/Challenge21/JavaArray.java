package Challenges.Challenge21;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Collections;

public class JavaArray {

    private static Scanner scanner = new Scanner(System.in);


    public static int[] getIntegers(int arrayNumber) {
        int[] numArray = new int[arrayNumber];
        System.out.println("Please enter " + arrayNumber + " numbers");
        for (int i = 0; i < arrayNumber; i++) {
            numArray[i] = scanner.nextInt();
        }
        return numArray;
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }


    public static void printArray(int[] array) {
        System.out.println("Here are your numbers organized in ascending order, desceding was next level Eiensten shit ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {


        int[] myArray = getIntegers(5);
        sortArray(myArray);
        printArray(myArray);
    }


}