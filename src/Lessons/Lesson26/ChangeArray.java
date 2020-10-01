package Lessons.Lesson26;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeArray {

    public static Scanner scanner = new Scanner(System.in);
    public static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);

    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];

        }
    }
}
