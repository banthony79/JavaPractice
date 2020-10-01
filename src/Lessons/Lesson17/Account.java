package Lessons.Lesson17;

public class Account {


    private int accountNumber;
    private String accountName;
    private int credit;
    private int balanceOwed;


    //establishing setters

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setbalanceOwed(int balanceOwed) {
        this.balanceOwed = balanceOwed;
    }

    //establishing getters

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public int getCredit() {
        return this.credit;
    }

    public int getBalanceOwed() {
        return this.balanceOwed;

    }

    public int creditAvailable() {
        return credit - balanceOwed;

    }


    public static void main(String[] args) {

        Account account = new Account();
        Account accountone = new Account();
        account.setAccountNumber(12345);
        account.setAccountName("Dave's Pizza");
        account.setCredit(10000);
        account.setbalanceOwed(2379);
        System.out.println(account.accountName + " owes us " + account.creditAvailable());
        accountone.setAccountNumber(123456);
        accountone.setAccountName("Fuckwad's Sock Drawer");
        accountone.setCredit(5300);
        accountone.setbalanceOwed(2312);
        System.out.println(accountone.accountName + " owes us " + accountone.creditAvailable());

    }
}
