package July14;

import java.util.Scanner;

public class LargerNumber {



    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int largernumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        num1 = input.nextInt();
        System.out.println("Please enter a second number");
        num2 = input.nextInt();
        largernumber = NumberisBigger(num1, num2);
                System.out.println("The bigger number is " + largernumber + ".");


    }

    public static int NumberisBigger(int num1, int num2) {
        if (num1 > num2) return num1;
        else return num2;


    }


}
