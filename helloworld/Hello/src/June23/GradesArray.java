package June23;

import java.util.Scanner;

public class GradesArray {

        //input as many numbers as you want and it calculates the average

        public static void main(String[] args) {
            int sum = 0;
            int[]grades;
            Scanner sc = new Scanner(System.in);
            System.out.println ("How many integers would you like to enter");
            int elements = sc.nextInt();
            grades = new int[elements];

            System.out.println("Enter grades");
            for (int i = 0; i < elements; i++){
                int temp = sc.nextInt();
                grades[i] = temp;
                sum = sum + temp;
            }
            System.out.println("Sum: " + sum);
            int average = sum/elements;
            System.out.println("Average: " +average);

            if (sum >= 60) {
                System.out.println("Passed");
            } else
            if (sum <= 60) {
                System.out.println("Failed");
            }
        }

    }

