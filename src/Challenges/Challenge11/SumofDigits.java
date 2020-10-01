package Challenges.Challenge11;

public class SumofDigits {

    private static int SumDigits(int number) {

        if (number < 10) {
            return -1;
        }


        //125 -> 125/10 = 12 --> 12 * 10 = 120 --> 125-120 = 5
        int sum = 0;

        //wanna keep looping while the number is greater than zero
        while (number > 0) {
            //extract the least signigant digit
            int digit = number % 10;
            //1st loop - 112 % 10 = 2
            //now the number is 11
            //2nd loop - 11 % 10 = 1
            //now the number is 1
            //3rd loop - 1 % 10 = 1
            System.out.println(digit);
            sum += digit;
            //first loop - 0 + 2 =2
            //second loop - 2 + 1 = 3
            //third loop - 3 + 1 = 4 (number is now 4)
            System.out.println(sum);
            //drop least signfigant digit
            number /= 10; //same as number = number / 10;
            //first loop - 112 / 10 = 11
            //second loop -  11 / 10 = 1
            //third loop - 1 / 10 = 0;
            System.out.println(number);
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("The sum of 112 is " + SumDigits(112));

    }

}
