package PersonalStuff.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Store store = new Store();

    public static List<Item> shoppingList = new ArrayList<Item>();

    public static void main(String[] args) {

        store.addItem("Apples", .75);
        store.addItem("Bread", 2.69);
        store.addItem("Eggs", 4.00);
        addItemToList("Apples", 5);
        addItemToList("Eggs", 1);
        addItemToList("Bread", 2);

        System.out.println("Your total is " + getTotal());
    }


    public static void addItemToList(String itemName, int howMany) {
        for (int i = 0; i < store.getItems().size(); i++) {
            if (itemName.equals(store.getItems().get(i).getName())) {
                for (int j = 0; j < howMany; j++) {
                    shoppingList.add(store.getItems().get(i));
                }


            }


        }
        System.out.println(itemName + " added");
    }


    public static double getTotal() {
        double sum = 0;
        for (int i = 0; i < shoppingList.size(); i++) {
            sum = sum + shoppingList.get(i).getPrice();
        }
        return sum;
    }

    public static void printList() {
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i).getName() + " ----> " +
                    shoppingList.get(i).getPrice());
            System.out.println("Your total is " + getTotal());
        }
    }
}
