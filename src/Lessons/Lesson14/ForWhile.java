package Lessons.Lesson14;

public class ForWhile {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count Value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;

        }

    }

}