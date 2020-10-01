package CodingExercises.CodingExercise25;

public class NumberToWords {

    public static void numbertoWords(int number) {

        int lastDigit = 0;
        int sum = getDigitCount(number);
        if (sum < 1) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = Reverse(number);
        while (sum > 0) {
            lastDigit = reversedNumber % 10;
            if (lastDigit == 0) {
                System.out.println("Zero");
            } else if (lastDigit == 1) {
                System.out.println("One");
            } else if (lastDigit == 2) {
                System.out.println("Two");
            } else if (lastDigit == 3) {
                System.out.println("Three");
            } else if (lastDigit == 4) {
                System.out.println("Four");
            } else if (lastDigit == 5) {
                System.out.println("Five");
            } else if (lastDigit == 6) {
                System.out.println("Six");
            } else if (lastDigit == 7) {
                System.out.println("Seven");
            } else if (lastDigit == 8) {
                System.out.println("Eight");
            } else if (lastDigit == 9) {
                System.out.println("Nine");
            }
            reversedNumber = reversedNumber / 10;

        }
    }


    public static int Reverse(int number) {
        int reverse = 0;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = (number % 10);
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        ;

        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            number = number / 10;
            count++;

        }
        return count;
    }


}
