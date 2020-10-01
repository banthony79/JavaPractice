package PersonalStuff;

import java.util.Scanner;

public class TonnageCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static double tonsNeeded(double length, double width, double depth) {
        double depthInFeet = depth / 12;
        return length * width * depthInFeet * .0508;
    }


    public static void main(String[] args) {

        System.out.println("Please enter the width in feet");
        int width = scanner.nextInt();
        System.out.println("Please enter the length in feet");
        int length = scanner.nextInt();
        System.out.println("Please enter the depth in inches");
        double depth = scanner.nextInt();

        System.out.println("The tonnage needed will be " + String.format("%.2f", tonsNeeded(width, length, depth)) + " tons.");
    }
}