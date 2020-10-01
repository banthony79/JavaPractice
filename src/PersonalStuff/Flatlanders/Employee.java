package PersonalStuff.Flatlanders;

public class Employee {

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee(String name, String phoneNumber, Customer customer) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.customer = customer;
    }

    private String name;
    private String phoneNumber;
    public Customer customer;
}
