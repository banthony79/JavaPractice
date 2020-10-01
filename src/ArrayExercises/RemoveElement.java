package ArrayExercises;

import java.util.Scanner;

public class RemoveElement {

    private static Scanner input = new Scanner(System.in);

    public static int[] enterIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        return array;
    }

    public static int[] removeElement(int[] array) {
        System.out.println("Please enter elee");
        return array;
    }

}

