package Lessons.Lesson13;

public class InterestRateCalculator {


    public static double CalculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }

    public static void main(String[] args) {
        System.out.println("Interest rate at 2% interest = " + CalculateInterest(10000, 2));
        System.out.println("Interest rate at 3% interest = " + CalculateInterest(10000, 3));
        System.out.println("Interest rate at 4% interest = " + CalculateInterest(10000, 4));
        System.out.println("Interest rate at 5% interest = " + CalculateInterest(10000, 5));
    }
}
