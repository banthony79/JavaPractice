package ComIT.ComIT4;

import java.util.Scanner;


public class EmployeeSurvey {

    public static void Survey() {

        Scanner sc = new Scanner(System.in);
        Scanner ID = new Scanner(System.in);
        Scanner gender = new Scanner(System.in);
        Scanner Salary = new Scanner(System.in);
        System.out.println("Please enter how many employees");
        int numberofEmployees = sc.nextInt();
        int males = 0;
        int females = 0;
        int maleSalary = 0;
        int womenSalary = 0;
        int[] IDArray = new int[numberofEmployees];
        int[] genderArray = new int[numberofEmployees];
        int[] salaryArray = new int[numberofEmployees];
        for (int i = 0; i < numberofEmployees; i++) {
            System.out.println("Please enter ID (must be three digits)");
            IDArray[i] = ID.nextInt();
            int IDlength = Integer.toString(IDArray[i]).length();
            if (IDlength != 3) {
                System.out.println("Invalid entry, must be three digits");
                break;
            }
            System.out.println("Please enter gender (1 for male and 2 for female)");
            genderArray[i] = gender.nextInt();
            int genderSelection = genderArray[i];
            System.out.println(genderSelection);
            if ((genderSelection > 2) || (genderSelection < 1)) {
                System.out.println("Invalid Entry");
                break;
            } else {
                if (genderArray[i] == 1) {
                    males++;
                } else {
                    females++;
                }
                System.out.println("Please enter salary");
                salaryArray[i] = Salary.nextInt();
                if (salaryArray[i] < 1000 || salaryArray[i] > 150000) {
                    System.out.println("Invalid Entry");
                }
                if (genderSelection == 1) {
                    maleSalary += salaryArray[i];
                }
                if (genderSelection == 2) {
                    womenSalary += salaryArray[i];
                }

            }

        }


        double malePercentage = 100 * males / numberofEmployees;
        double femalePercentage = 100 * females / numberofEmployees;
        double averageFemaleSalary = (womenSalary / females);
        double averageMaleSalary = (maleSalary / males);

        System.out.println("There are " + males + " men in the company, which consists of " + malePercentage + "% of the workforce.");
        System.out.println("There are " + females + " women in the company, which consists of " + femalePercentage + "% of the workforce.");
        System.out.println("The average female salary is: $" + String.format("%.2f", averageFemaleSalary));
        System.out.println("The average male salary is: $" + String.format("%.2f", averageMaleSalary));

    }


    public static void main(String[] args) {

        Survey();


    }
}