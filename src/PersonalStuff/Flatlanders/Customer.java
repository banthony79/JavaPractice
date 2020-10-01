package PersonalStuff.Flatlanders;

public class Customer {

    public Customer(String name, String phoneNumber, boolean needsPO) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.needsPO = needsPO;

    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public boolean needsPO() {
        return needsPO;
    }

    private String name;
    private String phoneNumber;
    private boolean needsPO;

}
