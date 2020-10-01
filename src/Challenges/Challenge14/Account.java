package Challenges.Challenge14;

public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

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
        Account account = new Account();
        account.setAccountNumber(123456);
        account.setCustomerName("Bryce Looyenga");
        account.setPhoneNumber("306-290-4743");
        account.setEmail("Bryce@bank.com");
        account.deposit(1000);
        account.withdraw(250);
        account.withdraw(1000);
    }


}

