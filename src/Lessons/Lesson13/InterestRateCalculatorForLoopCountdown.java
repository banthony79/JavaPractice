package Lessons.Lesson13;

public class InterestRateCalculatorForLoopCountdown {

    //countdown the loop instead of count up
    //remember loop TERMINATES when the middle condition is met, this does not
    //mean how many times it loops.

    public static double CalculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }

    public static void main(String[] args) {
        for (int i = 8; i >= 2; i--) {
            System.out.println("Your interest rate at " + i + "%" + " = " + "$" + String.format
                    ("%.2f", CalculateInterest(10000, i)));
        }
    }
}



