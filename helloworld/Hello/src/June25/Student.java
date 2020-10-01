package June25;

import java.util.Scanner;

public class Student {


    public static void main(String[] args) {
        int[] people = new int[8];
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter heights of students in centimetres");

        for (int i = 0; i < people.length; i++) {
            int height = sc.nextInt();
            sum = sum + height;
        }

        System.out.println("Sum: " + sum);
        int average = sum / 8;
        System.out.println("Average: " + average);

        String out = "The numbers above average are ";
        for (int n = 0; n < 8; n++) {
            if (people[n] > average) ;
            out = +people[n] + " ";
        }
        System.out.println(out);
    }
}
