package JavaChallenges;

import java.util.Scanner;

public class OddorEven {

    public static int OddNumbers(int num1, int num2) {

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println(num1 + " & " + num2 + " are not odd numbers.");
            return -1;
        } else if (num2 % 2 == 0) {
            System.out.println(num2 + " is not an odd number.");
            return -1;
        } else if (num1 % 2 == 0) {
            System.out.println(num1 + " is not an odd number.");
            return -1;
        }
        for (int i = num1; i <= num2; i += 2) {
            System.out.println(i);
        }
        return num1;
    }


    public static void main(String[] args) {

        OddNumbers(11, 31);

    }
}
