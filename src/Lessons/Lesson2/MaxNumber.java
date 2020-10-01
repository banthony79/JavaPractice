package Lessons.Lesson2;

public class MaxNumber {

    public static void main(String[] args) {


        Long myMaxLongNumber = Long.MAX_VALUE;
        Long myMinLongNumber = Long.MIN_VALUE;

        short myMaxShortNumber = Short.MAX_VALUE;
        short myMinShortNumber = Short.MIN_VALUE;

        byte myMaxByteNumber = Byte.MAX_VALUE;
        byte myMinByteNumber = Byte.MIN_VALUE;

        int myMaxIntNumber = Integer.MAX_VALUE;
        int MyMinIntNumber = Integer.MIN_VALUE;

        System.out.println("The biggest Long number possible is " + myMaxLongNumber);
        System.out.println("The smallest Long number possible is " + myMinLongNumber);
        System.out.println("The biggest Short number possible is " + myMaxShortNumber);
        System.out.println("The smallest Short number possible is " + myMinShortNumber);
        System.out.println("The biggest Byte number possible is " + myMaxByteNumber);
        System.out.println("The smallest Byte number possible is " + myMinByteNumber);
        System.out.println("The biggest Integer number possible is " + myMaxIntNumber);
        System.out.println("The smallest Integer number possible is " + MyMinIntNumber);
    }
}