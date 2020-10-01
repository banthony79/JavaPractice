package PersonalStuff.Payroll;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class EmployeeList {


    // public static LinkedList<Employee> getEmployees() {
    //  return employees;
    //}

    public Employee addEmployee(String employeeName, int salary, ArrayList<Employee> arrayList) {
        if (findEmployee(employeeName, arrayList) == null) {
            arrayList.add(new Employee(employeeName, salary));
        } else {
            System.out.println("Employee already exists");
            return null;
        }
        return null;
    }

    public Employee findEmployee(String name, ArrayList<Employee> arrayList) {
        for (Employee checkedEmployee : arrayList) {
            if (checkedEmployee.name.equals(name)) {
                return checkedEmployee;
            }
        }
        return null;
    }


    public double findAverage(ArrayList<Employee> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i).getSalary();
        }

        return sum / arrayList.size();

    }


    public void displaySalaryAbove(int salary, ArrayList<Employee> arrayList) {
        //ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (salary < arrayList.get(i).getSalary()) {
                count++;
                System.out.println((arrayList.get(i).toString()));
            }
        }

        System.out.println((writeNumberOut(count)) + " employees make over $" + salary);
        System.out.println("============");

    }


    public static void printList(ArrayList<Employee> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
        }
    }

    //public static void changeSalary()


    public String writeNumberOut(int num) {
        switch (num) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
        }

        return null;
    }
}



