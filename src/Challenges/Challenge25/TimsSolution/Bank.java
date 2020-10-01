package Challenges.Challenge25.TimsSolution;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();

    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double intialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, intialAmount);
        }
        return false;
    }


    public boolean addCustomerTranscation(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (this.branches.get(i).getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTranscations) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");

                if (showTranscations) {
                    System.out.println("Transactions");
                    ArrayList<Double> transcations = branchCustomer.getTransactions();
                    for (int j = 0; j < transcations.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transcations.get(j));
                    }
                }

            }

            return true;
        } else {
            return false;
        }
    }
}



















