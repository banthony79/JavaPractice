package Lessons.Lesson13;

public class InterestRateCalculatorForLoop {


    //String.format("%.2f") formats decimal places, number before f represents number of places

    public static double CalculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("Your interest rate at " + i + "%" + " = " + "$" + String.format
                    ("%.2f", CalculateInterest(10000, i)));
        }
    }
}
