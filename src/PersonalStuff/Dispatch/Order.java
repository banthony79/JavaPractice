package PersonalStuff.Dispatch;

import java.util.ArrayList;

public class Order {

    private static ArrayList<Customer> customerList = new ArrayList<Customer>();

    private Customer customer;
    String address;
    String city; //blank for Saskatoon
    Customer.Employee employee;
    int tonnage;
    String PO;

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public Customer.Employee getEmployee() {
        return employee;
    }

    public String getPO() {
        return PO;
    }

    public Order(Customer customer, String address, String city, Customer.Employee employee, int tonnage, String PO) {
        this.customer = customer;
        this.address = address;
        this.city = city;
        this.employee = employee;
        this.tonnage = tonnage;
        if (!customer.hasPO()) {
            this.PO = null;
        }

        if (city.isEmpty()) {
            this.city = "Saskatoon";
        }
    }

    public Order findOrder(Order order) {
        if (customer.getOrderList().contains(order)) {
            return order;
        } else {
            return null;
        }
    }


    public boolean createOrder(Order order) {
        customer.getOrderList().add(new Order(customer, address, city, employee, tonnage, city));
        return true;
    }

    public String getEmployee(Customer.Employee employee) {
        return employee.getEmployeeName() + " - " +
                employee.getPhoneNumber();
    }


    public static ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getTonnage() {
        return tonnage;
    }

    public static boolean addCustomer(String customerName, int customerCategory, boolean needsPO) {
        if (findCustomer(customerName) == null) {
            customerList.add(new Customer(customerName, needsPO, customerCategory));
        }
        return false;
    }

    public static Customer findCustomer(String customerSearchName) {
        for (int i = 0; i < customerList.size(); i++) {
            Customer testCustomer = customerList.get(i);
            if (testCustomer.getCustomerName().equals(customerSearchName)) {
                return null;
            } else {
                return testCustomer;
            }
        }
        return null;
    }
}
