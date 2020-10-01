package ComIT.ComIT3;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int salary = 0;
        String name = "";
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of employees");
        int numberofEmployees = sc.nextInt();
        double[] salaryArray = new double[numberofEmployees];
        String[] nameArray = new String[numberofEmployees];
        Scanner nameInput = new Scanner(System.in);
        Scanner salaryInput = new Scanner(System.in);
        for (int i = 0; i < numberofEmployees; i++) {
            System.out.println("Please enter name of employee");
            nameArray[i] = nameInput.nextLine();
            {
                System.out.println("Please enter employee salary");
                salaryArray[i] = salaryInput.nextDouble();
                sum += salaryArray[i];
                if (salaryArray[i] < 1000 || salaryArray[i] > 150000) {
                    System.out.println("Invalid Value");
                    break;
                }
                if (salaryArray[i] <= 30000 && salaryArray[i] > 20001) {
                    salaryArray[i] = salaryArray[i] * 1.12;
                    sum += salaryArray[i];
                    System.out.println(nameArray[i] + " is eligible for a pay increase of 12%");
                }
                if (salaryArray[i] <= 20000) {
                    salaryArray[i] = salaryArray[i] * 1.15;
                    sum += salaryArray[i];
                    System.out.println(nameArray[i] + " is eligible for a pay increase of 15%");
                }
            }

        }
        for (int j = 0; j < numberofEmployees; j++) {
            System.out.println(nameArray[j] + " - $" + String.format("%.2f", salaryArray[j]));
        }
        System.out.println("The sum of salaries is " + "$" + String.format("%.2f", sum));


        int k = 0;
        double max = salaryArray[k];
        for (k = 0; k < numberofEmployees; k++) {
            if (salaryArray[k] > max)
                max = salaryArray[k];
        }
        System.out.println("The largest salary is " + max);

    }
}

