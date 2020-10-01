package PersonalStuff.Bank;

public class Main {

    public static void main(String[] args) {

        Account brycesaccount = new Account("Bryce", "Looyenga", 13244, 50);
        Account ashleysaccount = new Account("Ashley", "Lonson", 12355, 100);


        brycesaccount.deposit(150);
        brycesaccount.withdraw(85);
        brycesaccount.accountBalance();
        brycesaccount.interest(514);


    }

}
