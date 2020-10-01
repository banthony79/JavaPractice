package Lessons.Lesson43.BrycesOffice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Office {

    private String name;
    public ArrayList<Employee> employeeList;



    public Office(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public boolean addEmployee(String name, int salary, Department department) {
        if (findEmployee(name) == null) {
            Employee newEmployee = new Employee(name, salary, department);
            employeeList.add(newEmployee);
            department.getDepartmentEmployees().add(newEmployee);
            return true;
        } else {
            System.out.println(name + " already exists");
            return false;
        }
    }

   public void assignManager(String name) {
       findEmployee(name).makeManager();
   }

    public Employee findEmployee(String name) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (name.equals(employeeList.get(i).getName())) {
                return employeeList.get(i);

            }
        }
        return null;
    }

    public void applyRaise(double percentage) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            employee.raise(percentage);
        }
    }

    public String displayInfo(String name) {
        Employee employee = findEmployee(name);
        return employee.toString();
    }

    public void listAllEmployees() {
        for (int i = 0; i < employeeList.size(); i++) {
             Employee employee = employeeList.get(i);
            displayInfo(employee.getName());
        }
    }


    public boolean removeEmployee(String name) {
        Employee employee = findEmployee(name);
        if (employee == null) {
            System.out.println("That employee does not exist");
            return false;
        } else {
            employeeList.remove(employee);
            return true;

        }
    }
}
