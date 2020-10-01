package July14;

import java.util.Scanner;

public class ExerciseA {
    public static void main(String[] args) {
        int num1 = 0;
        Scanner input = new Scanner(System.in);
        double gradeone = 1.0, gradetwo = 2.0, gradethree = 3.0;
        double average = 1.0;
        System.out.println("Please enter first grade");
        gradeone = input.nextDouble();
        System.out.println("Please enter second grade");
        gradetwo = input.nextDouble();
        System.out.println("Please enter third grade");
        gradethree = input.nextDouble();
        average = gradeAverage(gradeone, gradetwo, gradethree);
        System.out.println("The average of the grades is " + average + ".");

        }

        public static double gradeAverage(double a, double b, double c) {
        double avg = (a+b+c)/ 3;
        return avg;

    }


    }





















