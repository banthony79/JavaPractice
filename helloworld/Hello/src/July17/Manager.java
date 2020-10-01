package July17;

public class Manager extends Employee{

    public Manager(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    private int salary;

    public Manager(String name, int id) {
        super(name, id);
    }


}
