package Lessons.Lesson36;

public class Main {

    public static void main(String[] args) {
        Account bryceAccount = new Account("Bryce Account");
        bryceAccount.deposit(1000);
        bryceAccount.withdraw(500);
        bryceAccount.withdraw(-200);
        bryceAccount.deposit(-20);
        bryceAccount.calculateBalance();
        // bryceAccount.balance = 5000;


        System.out.println("Balance on this account is " + bryceAccount.getBalance());

        //bryceAccount.transactions.add(5000);

        bryceAccount.calculateBalance();


    }
}
