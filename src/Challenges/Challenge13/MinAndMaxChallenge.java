package Challenges.Challenge13;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number");
            boolean isAnInt = sc.hasNextInt();


            if (isAnInt) {
                int number = sc.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;

                }
                if (number > max) {
                    max = number;
                }
                if (number < max) {
                    max = number;
                }
            } else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("min = " + min + " and max = " + max);
        sc.close();
    }
}