package PersonalStuff.Payroll;

public class Employee {

    //updating for git testing

    String name;
    int Salary;

    public Employee(String name, int salary) {
        this.name = name;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee: "
                + name + ": $"
                + Salary;
    }
}
