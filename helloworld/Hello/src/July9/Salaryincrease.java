package July9;

import java.util.Scanner;

public class Salaryincrease {



    public static void main(String[] args) {

        System.out.println("How many employees are in the survey?");
        Scanner in = new Scanner(System.in);
        int peopleinSurvey = in.nextInt();
        Participation[] employees = new Participation[peopleinSurvey];

        for (int i = 0; i <= peopleinSurvey; i++) {

            System.out.println("Please enter first name");
            String firstName = in.next();
            System.out.println("Please enter second name");
            String secondName = in.next();
            System.out.println("Please enter their salary");
            int salary = in.nextInt();
            if (salary <= 30000) {
                double salaryfifteenth = salary * 1.15;
                System.out.println("Their new Salary is" + salaryfifteenth + ".");
            } else if
            (salary > 30000) {
                double salarytwelfth = salary * 1.12;
                System.out.println("Their new salary is $" + salarytwelfth + ".");

            }


            employees[i] = new Participation(firstName, secondName, salary);
        }


    }
}




