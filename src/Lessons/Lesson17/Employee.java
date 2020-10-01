package Lessons.Lesson17;

public class Employee {

    private int ID;
    private String firstName;
    private String lastName;
    private int salary;


    //establish getters

    public int getID() {
        return this.ID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    //establish setters

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {


        Employee employee = new Employee();
        employee.setID(510);
        employee.setFirstName("John");
        employee.setLastName("Black");
        employee.setSalary(45000);
        System.out.println("New employee's first name is: " + employee.getFirstName());
        System.out.println("New employee's last name is: " + employee.getLastName());
        System.out.println("New employee's ID is " + employee.getID() + " and their salary is " + employee.getSalary());

    }

}