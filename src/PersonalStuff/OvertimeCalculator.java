package PersonalStuff;

import java.sql.SQLOutput;

public class OvertimeCalculator {

    public static double Overtime(int hours, double salary) {
        return hours * (salary * 1.5);
    }

    public static double Taxes(double salary) {
        return salary * .5;
    }

    public static void main(String[] args) {
        System.out.println("You have made approximately " + Overtime(17, 26) + " in overtime.");
        System.out.println("After taxes = " + Taxes(Overtime(17, 26)));
    }
}
