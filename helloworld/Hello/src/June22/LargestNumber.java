package June22;

import java.util.Scanner;

public class LargestNumber {

        public static void main(String[] args) {
            System.out.println ("Please enter two numbers. ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a >= b) {
                System.out.println(a + " is the largest number.");
            } else
            if (b >= a) {
                System.out.println(b + " is the largest number.");

            }
        }
    }


