package PersonalStuff.Bank;

public class Customer {

    private String firstName;
    private String lastName;
    private int accountNumber;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer(String firstName, String lastName, int accountNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        if (accountNumber < 10000 || accountNumber > 99999) {
            System.out.println("Account number must be five digits");
        } else {
            this.accountNumber = accountNumber;
        }


    }


}

