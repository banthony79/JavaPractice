package PersonalStuff.Payroll;


import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static EmployeeList employeeList = new EmployeeList();

    public static void main(String[] args) {

        employeeList.addEmployee("Bryce Looyenga", 150000, employees);
        employeeList.addEmployee("Stephanie Haines", 75000, employees);
        employeeList.addEmployee("Ryan Baines", 85000, employees);
        employeeList.addEmployee("Johnny Ilg", 40000, employees);
        employeeList.addEmployee("David Carroll", 75000, employees);
        employeeList.addEmployee("Devin Holder", 95000, employees);
        employeeList.addEmployee("Jasmine Looyenga", 56500, employees);
        employeeList.addEmployee("Sue Severns", 72000, employees);
        employeeList.addEmployee("James Black", 55000, employees);
        employeeList.addEmployee("Johnny Dione", 61000, employees);

        System.out.println("The Average is " + employeeList.findAverage(employees));


        employeeList.displaySalaryAbove(75800, employees);


    }


}
