package Challenges.Challenge12;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        int count = 1;
        int sum = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input 10 numbers");

        while (count < 11) {

            System.out.println("Enter number #" + count);
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                number = sc.nextInt();
                count++;
                sum += number;
            } else {
                System.out.println("Invalid Number");
                break;
            }

        }

        System.out.println("The sum of the numbers is " + sum);
        sc.close();

    }
}


