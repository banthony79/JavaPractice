package Lessons.Lesson24;

public class ArrayPractice {

    public static void printArray(int[] array) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println("The number " + i + " value is " + array[i]);
            sum += array[i];

        }
        System.out.println("The sum of numbers is " + sum);

    }

    public static void main(String[] args) {

        int[] brycearray = new int[25];
        printArray(brycearray);

    }
}
