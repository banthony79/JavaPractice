package ComIT5;

import java.util.Scanner;

public class CoinCounter {
    public static void CoinCounter() {
        Scanner sc = new Scanner(System.in);
        double dollarCount = 0;
        double quarterCount = 0;
        double dimeCount = 0;
        double nickelCount = 0;
        double pennyCount = 0;
        double remainder = 0;
        double coinAmount = 0;


        System.out.println("Please enter dollar amount,");

        coinAmount = sc.nextDouble();
        while (true) {
            if (coinAmount < 0) {
                System.out.println("Invalid Value");
                System.out.println("Please enter dollar amount,");
                coinAmount = sc.nextDouble();
            }
            if (coinAmount > 0) {
                coinAmount = coinAmount * 100;

                dollarCount = (int) coinAmount / 100;
                remainder = (int) coinAmount % 100;
                quarterCount = (int) remainder / 25;
                remainder = (int) remainder % 25;
                dimeCount = (int) remainder / 10;
                remainder = (int) remainder % 10;
                nickelCount = (int) remainder / 5;
                remainder = (int) remainder % 5;
                pennyCount = (int) remainder;
                remainder = (int) remainder % 1;


                System.out.println("Dollars: " + String.format("%.0f", dollarCount));
                System.out.println("Quarters: " + String.format("%.0f", quarterCount));
                System.out.println("Dimes: " + String.format("%.0f", dimeCount));
                System.out.println("Nickels: " + String.format("%.0f", nickelCount));
                System.out.println("Pennies: " + String.format("%.0f", pennyCount));

                break;


            }
        }
    }


    public static void main(String[] args) {
        CoinCounter();
    }
}