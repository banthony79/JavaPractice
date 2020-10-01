package PersonalStuff;

import java.util.Scanner;


public class PricingCalculator {


    public static double pricingcalculator(int howManyLoads) {
        double sum = 0;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        if (howManyLoads < 0) {
            System.out.println("Invalid Entry");
            return -1;
        }
        for (int i = 0; i < howManyLoads; i++) {
            System.out.println("Please enter price.");
            if (total < 0) {
                System.out.println("Invalid entry");
                break;

            }
            total = sc.nextDouble();
            sum = sum + total;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your tax rate.");
        double taxrate = input.nextDouble();
        taxrate = (taxrate / 100);
        System.out.println("Your product price is: $" + sum);
        System.out.println("Taxes come out to: $" + (taxrate * sum));
        System.out.println("Your final total: $" + (sum + (taxrate * sum)));
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many loads.");
        int howManyLoads = sc.nextInt();
        pricingcalculator(howManyLoads);
    }
}