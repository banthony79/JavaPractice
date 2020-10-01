package Lessons.Lesson24;

import java.util.Arrays;

public class DescendingOrder {


    public static void main(String[] args) {
        int[] brycesArray = {12, 16, 24, 28, 32};
        Arrays.sort(brycesArray);
        for (int i = 0; i < brycesArray.length; i++) {
            System.out.println(brycesArray[i]);
        }


    }
}
