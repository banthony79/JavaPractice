package PersonalStuff.Flatlanders;

import java.util.Calendar;
import java.util.Date;

public class Order {

    public Order(int ID, Customer customer, Employee employee, Product product, Address address, int tonnage, String PO) {
        this.customer = customer;
        this.ID = ID;
        this.employee = employee;
        this.product = product;
        this.address = address;
        this.tonnage = tonnage;
        if (!customer.needsPO()) {
            this.PO = "none";
        } else {
            this.PO = PO;
        }
    }

    int ID;
    Customer customer;
    Employee employee;
    Product product;
    Address address;
    int tonnage;
    String PO;


    public void orderReadOut() {
        System.out.println(employee.getName() + " at " + customer.getName() + " needs " + tonnage + " tons of " +
                product.getName() + " at " + address.getStreetAddress() + " in " + address.getCity() + ".  " + "Phone number: " + employee.getPhoneNumber());

    }

    public void needsPO() {
        if ((customer.needsPO()) && (PO.isEmpty())) {
            System.out.println("This customer requires a PO");
        }
    }

    public void dispatched(Truck truck) {
        System.out.println(truck.getTruckNumber() + " has been dispatched on load for " + customer.getName() +
                " going to " + address.getStreetAddress() + " estimated time of delivery " + ETA());
    }

    public Date ETA() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, +2);
        return calendar.getTime();
    }


    public void delivered(Truck truck) {
        if (truck.isTandem) {
            tonnage = tonnage - 15;
        } else {
            tonnage = tonnage - 30;
        }
        System.out.println(truck.getTruckNumber() + " has delivered order number: " + ID +
                " for " + customer.getName());

        System.out.println(tonnage + " tons remain");
        if (tonnage <= 0) {
            System.out.println("load delivered");
        }
    }


}


