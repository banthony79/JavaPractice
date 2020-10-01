package Lessons.Lesson8;

import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student's grade");
        int grade = sc.nextInt();
        if (grade >= 90 && grade < 101) {
            System.out.println("Employee gets an A.");
        }
        if (grade >= 80 && grade < 89) {
            System.out.println("Employee gets a B.");
        }
        if (grade >= 70 && grade < 79) {
            System.out.println("Employee gets a C.");
        }
        if (grade >= 50 && grade < 69) {
            System.out.println("Students get a D.");
        }
        if (grade >= 0 && grade < 50) {
            System.out.println("Employee is a big fat failure.");
        }
        if (grade > 100) {
            System.out.print("impossible");
        }
    }
}

