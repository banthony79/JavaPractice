package June23;

import java.util.Scanner;

public class Raise {

    public static void main(String[] args) {
        System.out.println("Please enter yearly salary.");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if (salary <= 1000) {
            System.out.println("Your new salary is $" + salary * 1.15 + ".");
        } else if
        (salary > 1000) {
            System.out.println("Your new salary is $" + salary * 1.12 + ".");

        }

    }
}