package Challenges.Challenge25.BrycesSolution;

import java.util.ArrayList;

public class Customer {

    private static ArrayList<Double> transactions;
    private String name;
    private double intialAmount;
    private Branch branch;

    public Customer(String name, double intialAmount, Branch branch) {
        this.name = name;
        transactions.add(intialAmount);
        this.branch = branch;

    }

    public String getName() {
        return name;
    }

    public void addTranscation(double amount) {
        transactions.add(amount);
    }

}
