package June22;

import java.util.Scanner;

public class Grades {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter five grades.");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            if (a >= 60) {
                System.out.println(a + " - approved");
            } else if (a <= 60) {
                System.out.println(a + " - not approved");
            }
            if (b >= 60) {
                System.out.println(b + " - approved");
            } else if (b <= 60) {
                System.out.println(b + " - not approved");
            }
            if (c >= 60) {
                System.out.println(c + " - approved");
            } else if (c <= 60) {
                System.out.println(c + " - not approved");
            }
            if (d >= 60) {
                System.out.println(d + " - approved");
            } else if (d <= 60) {
                System.out.println(d + " - not approved");
            }
            if (e >= 60) {
                System.out.println(e + " - approved");
            } else if (e <= 60) {
                System.out.println(e + " - not approved");

            }
            int sum = a + b + c + d + e;
            int avg = sum/5;
            System.out.println("The average is " + avg + ".");

        }


    }

