package Lessons.Lesson24;

public class ArraysLesson {

    public static void main(String[] args) {

        int myVariable = 50; //normal variable assignment
        int[] myVariableArray = new int[10]; // = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //myVariableArray[5] = 50;
        //myVariableArray[4] = 25;

        printArray(myVariableArray);

    }

    public static void printArray(int[] array) {

        for (int i = 0; i < 10; i++) {
            array[i] = i * 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }


    }
}