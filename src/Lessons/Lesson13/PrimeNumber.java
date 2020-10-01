package Lessons.Lesson13;

public class PrimeNumber {

    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }
    }


}
