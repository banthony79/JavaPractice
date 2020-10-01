package Challenges.Challenge25.TimsSolution;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank("CIBC");
        bank.addBranch("Saskatoon");
        bank.addCustomer("Saskatoon", "Bryce", 50.05);
        bank.addCustomer("Saskatoon", "Mike", 125.50);
        bank.addCustomer("Saskatoon", "John", 150.05);

        bank.addBranch("Regina");
        bank.addCustomer("Regina", "Bob", 130.50);

        bank.addCustomerTranscation("Saskatoon", "Bryce", 100.25);
        bank.addCustomerTranscation("Saskatoon", "Bryce", 45.05);
        bank.addCustomerTranscation("Saskatoon", "Mike", 50.45);

        bank.listCustomers("Saskatoon", false);

        bank.listCustomers("Saskatoon", true);

        bank.listCustomers("Regina", true);


    }
}
