package Lessons.Lesson43.BrycesOffice;

import java.util.ArrayList;

public class Department extends Office {

    private String name;
    private ArrayList <Employee> departmentEmployees;

    public Department(String name) {
        super(name);
        this.departmentEmployees = new ArrayList<>();

    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<Employee> getDepartmentEmployees() {
        return departmentEmployees;
    }


    public void applyRaisetoDept(double percentage) {
        for (int i = 0; i < departmentEmployees.size(); i++) {
            Employee employee = departmentEmployees.get(i);
            employee.raise(percentage);
        }
    }


    public Employee findManager() {
        for (int i = 0; i < departmentEmployees.size(); i++) {
            Employee employee = departmentEmployees.get(i);
            if (employee.isManager()) {
                return employee;
            }
        }
        return null; }

    public void listEmployees() {
        System.out.println(this.name + " employee list");
        System.out.println();
        System.out.println("Manager - " + findManager().toString());
        System.out.println();
        for (int i = 0; i < departmentEmployees.size(); i++) {
            Employee employee = departmentEmployees.get(i);
            if (!employee.isManager()) {
                System.out.println(employee.toString());
            }
        }
        System.out.println();
        System.out.println("Total Dept Payroll: $" +  String.format("%.2f", totalPayRoll()));

    }

    public double totalPayRoll() {
        double total = 0;
        for (int i = 0; i < departmentEmployees.size(); i++) {
            Employee employee = departmentEmployees.get(i);
            total = total + employee.getSalary();
        } return total;

    }





}
