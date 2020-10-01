package Challenges.Challenge27.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employee implements ISaveable {

    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public List<String> write() {
        List<String> savedValues = new ArrayList<String>();
        savedValues.add(0, this.name);
        savedValues.add(1, this.department);
        savedValues.add(2, "" + this.salary);
        return savedValues;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.salary = Integer.parseInt(savedValues.get(1));
            this.department = savedValues.get(2);

        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
