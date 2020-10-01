package PersonalStuff.Bank;


public class Account extends Customer {

    public Account(String firstName, String lastName, int accountNumber, int balance) {
        super(firstName, lastName, accountNumber);

        this.balance = balance;

    }

    private double balance;

    public double deposit(double depositamount) {

        if (depositamount < 0) {
            System.out.println("Please enter a valid amount");
        } else {
            balance = balance + depositamount;
            System.out.println(getFirstName() + " has deposited $" + String.format("%.2f", depositamount) + " for a balance of $" + String.format("%.2f", balance));
            return balance;
        }

        return -1;
    }

    public double withdraw(double withdrawamount) {
        balance = balance - withdrawamount;
        if (withdrawamount > balance) {
            System.out.println("Insufficent funds");
            return -1;
        } else {
            System.out.println(getFirstName() + " has withdrawn $" + String.format("%.2f", withdrawamount) + " for a balance of $" +
                    String.format("%.2f", balance));
            return balance;
        }
    }

    public double accountBalance() {
        System.out.println(getFirstName() + " " + getLastName() + " currently has $" + String.format("%.2f", balance)
                + " in account number " + getAccountNumber());
        return this.balance;
    }

    public double interest(int days) {
        int remainder = days % 365;
        int years = days / 365;
        double balanceWithInterest = days * .03 + balance;
        if (years == 0) {
            System.out.println("After " + days + " days " + "you have $" + String.format("%.2f", balanceWithInterest) + " in account number " + getAccountNumber());
        } else {
            System.out.println("After " + remainder + " days and " + years + " year you have $" + String.format("%.2f", balanceWithInterest) + " in account number " + getAccountNumber());
        }
        return balanceWithInterest;
    }

    public void totalRunDown() {

    }


}
