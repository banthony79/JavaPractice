package ArrayExercises;

import java.util.Scanner;

public class MaxValue {


    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] numArray = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }
        return numArray;
    }

}

   /* public static int maxValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i + 1]) {
            }
        }
    //}
}*/
