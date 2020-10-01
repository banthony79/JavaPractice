package CodingExercises.CodingExercise25;

public class NumbertoWordsCheat {

    public static void numberToWords(int number) {

        if (number < 0) System.out.println("Invalid Value");
        int reverseCount = getDigitCount(number);
        int reverseNum = reverse(number);


        while (reverseCount > 0) {
            reverseCount--;
            int lastDigit = reverseNum % 10;
            reverseNum /= 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            number /= 10;
            reverse = reverse * 10;
            reverse += lastDigit;
        }
        return reverse; // not sure if this needed
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        int count = 0;
        do {
            number /= 10;
            count++;
        }
        while (number > 0);

        return count;

    }

}
