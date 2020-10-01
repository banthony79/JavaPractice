package PersonalStuff.LinkedList.ArrayListPractice;

import java.util.ArrayList;

public class Directory {

    public static ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

    public boolean addCustomer(String customerName, double balance) {
        if (findCustomer(customerName) < 0) {
            return customerArrayList.add(new Customer(customerName, balance));
        } else {
            System.out.println("Customer already exists");
            return false;
        }
    }


    public int findCustomer(String customerName) {
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeCustomer(String customerName) {
        customerArrayList.remove(findCustomer(customerName));
        return true;
    }

    private double getTotal() {
        double total = 0;
        for (int i = 0; i < customerArrayList.size(); i++) {
            total = customerArrayList.get(i).getBalance() + total;
        }
        return total;
    }


    public void showCustomers() {
        for (int i = 0; i < customerArrayList.size(); i++) {
            System.out.println((i + 1) + ": " + (customerArrayList.get(i).getName()
                    + " ---------> $" + String.format("%.2f", customerArrayList.get(i).getBalance())));
        }
        System.out.println(String.format("%.2f", getTotal()));
    }

}
