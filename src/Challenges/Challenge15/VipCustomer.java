package Challenges.Challenge15;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    {

    }

    public VipCustomer() {
        this("John Does", 0, "default@default.com");


    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "default@default.com");


    }


}