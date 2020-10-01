package July17;

public abstract class Employee extends Person {
    private int id;

    public Employee(String name, int id) {

        this.id=id;
    }

    public int getId() {
        return id;
    }
}
