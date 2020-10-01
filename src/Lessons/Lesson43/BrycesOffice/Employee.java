package Lessons.Lesson43.BrycesOffice;

import java.util.LinkedList;
import java.util.Random;

public class Employee {


    private int ID;
    private String name;
    private double salary;
    private boolean isManager;
    Department department;



    static int number = 1000;

    public Employee(String name, double salary, Department department) {
        number = number + 1;
        this.ID = number;
        this.name = name;
        this.salary = salary;
        this.isManager = false;
        this.department = department;



    }

    public int getID() {
        return ID;
    }

    public boolean isManager() {
        return isManager;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void makeManager() {
        isManager = true;
        salary = salary * 1.5;
    }

    public double raise(double percentage) {
        salary = salary * (1 + (percentage/100));
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee #  " + ID + " - " + name + " - " + String.format("$" + "%.2f",salary);
    }
}
