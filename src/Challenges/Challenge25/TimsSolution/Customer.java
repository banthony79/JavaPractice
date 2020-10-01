package Challenges.Challenge25.TimsSolution;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double intialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(intialAmount);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
