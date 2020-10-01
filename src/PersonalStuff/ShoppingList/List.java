package PersonalStuff.ShoppingList;

import java.util.ArrayList;

public class List {

    private String owner;

    public List(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    private ArrayList<item> itemList = new ArrayList<item>();


    public boolean addItem(String name, double itemPrice) {
        if (findItem(name) == null) {
            return itemList.add(new item(name, itemPrice));

        } else {
            return false;
        }
    }


    public boolean removeItem(String name) {
        if (findItem(name) == null) {
            int position = findItemPosition(name);
            itemList.remove(position);
            System.out.println(name + " has been removed.");
        }

        return false;
    }


    private item findItem(String name) {
        for (int i = 0; i < this.itemList.size(); i++) {
            item checkedItem = this.itemList.get(i);
            if (checkedItem.getItemName().equals(name)) {
                return checkedItem;
            }
        }
        return null;
    }


    private int findItemPosition(String name) {
        for (int i = 0; i < itemList.size(); i++) {
            item checkedItem = itemList.get(i);
            if (itemList.get(i).getItemName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < itemList.size(); i++) {
            sum = sum + itemList.get(i).getItemPrice();
        }


        return sum;
    }

    public double getAverage() {
        return getTotal() / itemList.size();
    }

    public void printList() {
        for (int i = 0; i < itemList.size(); i++) {
            System.out.print(itemList.get(i).getItemName());

            System.out.println(itemList.get(i).getItemPrice());

        }
        System.out.println("Total: " + getTotal());
    }
}





