package PersonalStuff.BrycesPizza;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Pizza extends MenuItem {

    private int cookingTime;
    private ArrayList<Topping> toppingsList;
    private Size pizzaSize;
    private Crust pizzaCrust;
    private double price;


    public Pizza(String itemName, int itemNumber) {
        super(itemName, 0, itemNumber);
        this.toppingsList = new ArrayList<>();
        toppingsList.add(Topping.CHEESE);
        toppingsList.add(Topping.PIZZA_SAUCE);
        this.pizzaSize = Size.MEDIUM;
        switch (pizzaSize) {
            case SMALL:
                this.price = 7.00;
                break;
            case MEDIUM:
                this.price = 10.00;
                break;
            case LARGE:
                this.price = 15.00;
                break;
            case XTRA_LARGE:
                this.price = 20.00;
                break;
        }


    }

    //"MEDIUM" + "\t" + "10.00" + "\t" + "LARGE" + "\t" + "15.00" + "\t" + "EXTRA LARGE" + "\t" + "20.00");

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        XTRA_LARGE
    }

    public enum Topping {
        PEPPERONI,
        PINEAPPLE,
        HAM,
        MUSHROOMS,
        GREEN_PEPPERS,
        BACON,
        SAUSAGE,
        EXTRA_CHEESE,
        BLACK_OLIVES,
        CHEESE,
        PIZZA_SAUCE,

    }

    public enum Crust {
        THIN,
        REGULAR,
        GLUTEN_FREE
    }

    public void setPizzaSize(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setPizzaCrust(Crust pizzaCrust) {
        this.pizzaCrust = pizzaCrust;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<Topping> getToppingsList() {
        return toppingsList;
    }

    public void addTopping(Topping topping) {
        toppingsList.add(topping);
    }

    public void addTopping(Topping topping, Topping secondToppping) {
        toppingsList.add(topping);
        toppingsList.add(secondToppping);
    }

    public void addTopping(Topping topping, Topping secondTopping, Topping thirdTopping) {
        toppingsList.add(topping);
        toppingsList.add(secondTopping);
        toppingsList.add(thirdTopping);
    }

    public void addTopping(Topping topping, Topping secondTopping, Topping thirdTopping, Topping fourthTopping) {
        toppingsList.add(topping);
        toppingsList.add(secondTopping);
        toppingsList.add(thirdTopping);
        toppingsList.add(fourthTopping);
    }


    private double toppingsCost() {
        double sum = 0;
        for (int i = 0; i < this.toppingsList.size(); i++) {
            double toppingsPrice = 0;
            Topping toppings = this.toppingsList.get(i);
            switch (toppings) {
                case HAM:
                    toppingsPrice = 1.25;
                case BACON:
                    toppingsPrice = 1.50;
                case MUSHROOMS:
                    toppingsPrice = .75;
                case PEPPERONI:
                    toppingsPrice = 1.00;
                case GREEN_PEPPERS:
                    toppingsPrice = .75;
                case PINEAPPLE:
                    toppingsPrice = .50;
                case CHEESE:
                    toppingsPrice = 0;
                case PIZZA_SAUCE:
                    toppingsPrice = 0;
                case SAUSAGE:
                    toppingsPrice = 1.50;
                case BLACK_OLIVES:
                    toppingsPrice = .75;
                case EXTRA_CHEESE:
                    toppingsPrice = 1.00;

            }



       sum = sum + toppingsPrice;
            //System.out.println(sum);
        }


   return sum; }




    private double crustCost() {
        double crustPrice = 0;
        Crust crust = this.pizzaCrust;
        switch (crust) {
            case REGULAR:
                crustPrice = 0;
                break;
            case THIN:
                crustPrice = 2;
                break;
            case GLUTEN_FREE:
                crustPrice = 3;
                break;

        }
        return crustPrice;
    }



    /*private double sizeCost() {
        Size size = this.pizzaSize;
        double sizePrice = 0;
        switch (size) {
            case SMALL:
                 = 10;
            case MEDIUM:
                sizePrice = 15;
            case LARGE:
                sizePrice = 20;
            case XTRA_LARGE:
                sizePrice = 25;

        }
        return sizePrice;
    }*/

    public Pizza makePizza(Crust crust, Size size) {
        this.setPizzaCrust(crust);
        this.setPizzaSize(size);
        return this;
    }


    public double calculatePrice() {
        this.price = this.price + crustCost();
        return this.price;
    }

    public double getPrice() {
        return this.price;

    }

    public double calculateToppingsPrice() {
        this.price = this.price + crustCost() + toppingsCost();
        return this.price;
    }

    public String toString() {
        return "A " + this.pizzaSize + " " + this.getItemName() + " pizza with a " + this.pizzaCrust + " crust " + "\n" +
                listToppings() + "\n" +
                "Price is " + String.format("%.2f", this.getPrice());

    }

    public String listToppings() {
        String description = "";
        Iterator i = toppingsList.iterator();

        while (i.hasNext()) {
            description = " " + capitalizeFirstLetter(i.next().toString().toLowerCase() + description);
        }
        return "Toppings list includes: " + " " + description;
    }


    private String capitalizeFirstLetter(String word) {
        String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
        return cap;
    }

}





