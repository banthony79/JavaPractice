package Lessons.Lesson18;

//learning constructors

public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        //you can put whatever you want in here that will initialize when a new object(account)
        //is created. You can also put default values here for when an empty constructor is available
        this(10000, 0, "default customer",
                "no email", "306-555-0101");
    }

    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //establish setters

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //establish getters

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double deposit(double deposit) {
        this.balance = deposit + this.balance;
        System.out.println(customerName + " have deposited $"
                + String.format("%.2f", deposit) +
                " for a balance of $" + String.format("%.2f", this.balance));
        return this.balance;
    }

    public double withdraw(double withdraw) {
        if (withdraw > balance) {
            System.out.println("Insufficent funds");
            return -1;
        } else {
            this.balance = this.balance - withdraw;
            System.out.println(customerName + " has withdrew $" +
                    String.format("%.2f", withdraw) +
                    " for a balance of $" + String.format("%.2f", this.balance));

            return balance;
        }

    }

    public static void main(String[] args) {
        Account accountc = new Account();
        Account accountb = new Account(12345, 1000,
                "Bryce Looyenga", "bryce@bank.com", "306-290-4743");

        System.out.println(accountb.accountNumber);
        accountb.withdraw(27.16);
        System.out.println(accountc.accountNumber);
    }


}

