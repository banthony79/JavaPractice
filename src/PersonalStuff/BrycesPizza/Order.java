package PersonalStuff.BrycesPizza;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {

    static int number = 1;

    private String customerName;
    private ArrayList<MenuItem> items;
    private int quantity;
    private int orderNumber;


    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.quantity = 1;
        this.orderNumber = orderNumber + 1;

    }


    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addToOrder(int quantity, MenuItem item) {
        this.quantity = quantity;
        for (int i = 0; i < quantity; i++) {
            items.add(item);

        }
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public boolean addtoOrder(MenuItem item) {
        System.out.println(item.getItemName() + " has been added.");
        return items.add(item);

    }

    public void setQuantity(int quantity, MenuItem menuItem) {
        for (int i = 0; i < quantity; i++) {
            addtoOrder(menuItem);
        }
    }


    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }


    public double getTotal() {
        double sum = 0;
       for (MenuItem item: items) {
           sum = sum + (item.getItemPrice() * quantity);
       }
   return sum; }


    @Override
    public String toString() {

        System.out.println("********** " + (this.customerName).toUpperCase() + " ORDER" + " *********");
        for (int i = 0; i < items.size(); i++)  {
            MenuItem item = items.get(i);
            System.out.println(item.getItemNumber() + " - " + item.getItemName() +  " x " + quantity +" - $"
                    + String.format("%.2f", (quantity * item.getItemPrice())));



        }


        System.out.println();
        return "Total: $" + (String.format("%.2f", this.getTotal() * 1.11));
    }






}
