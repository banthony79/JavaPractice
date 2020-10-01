package PersonalStuff.BrycesPizza;

import java.util.LinkedList;

public class Restaurant {

    private String resturantName;
    private LinkedList<Order> orderList;
    private Menu menu;

    public Restaurant(String resturantName) {
        this.resturantName = resturantName;
        this.orderList = new LinkedList<>();
        this.menu = new Menu();
    }

    public String getResturantName() {
        return resturantName;
    }

    public LinkedList<Order> getOrderList() {
        return orderList;
    }

    public Menu getMenu() {
        return menu;
    }


    public Order retrieveOrder(int orderNumber) {
        for (Order order : orderList) {
            if (order.getOrderNumber() == orderNumber) {
                return order;
            }
        }
        System.out.println("That order doesn't exist");
        return null;
    }




        public Order makeOrder(String name) {
        Order order = new Order(name);
        return order; }


}


