package Challenges.Challenge25.BrycesSolution;

import java.util.ArrayList;

public class Branch {

    String name;
    private static ArrayList<Customer> customerlist;

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean createCustomer(String customerName, double intialTransaction, Branch branch) {
        if (findCustomer(customerName) != null) {
            customerlist.add(new Customer(customerName, intialTransaction, branch));
        }
        return false;
    }

    public Customer findCustomer(String customerName) {
        for (int i = 0; i < customerlist.size(); i++) {
            Customer checkedCustomer = customerlist.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public boolean addTranscation(String customerName, double transcation) {
        Customer existingCustomer = findCustomer(customerName);
        existingCustomer.addTranscation(transcation);
        return true;
    }
}







