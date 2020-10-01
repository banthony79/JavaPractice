package Lessons.Lesson3;


public class Casting {

    public static void main(String[] args) {

        byte myByteValue = 15;

        byte myNewByteValue = (byte) (myByteValue / 2);

        short myShortValue = 100;

        short myNewShortValue = (short) (myShortValue / 4);

        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);

    }
}
