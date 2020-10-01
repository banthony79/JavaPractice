package PersonalStuff.Store;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public static List<Item> items = new ArrayList<Item>();

    //private ArrayList<Item> items;


    public static List<Item> getItems() {
        return items;
    }

    public boolean addItem(String itemName, double itemPrice) {
        if (findItem(itemName) == null) {
            this.items.add(new Item(itemName, itemPrice));
            return true;
        }

        return false;
    }


    public Item findItem(String itemName) {
        for (Item checkedItem : this.items) {

            if (checkedItem.getName().equals(itemName)) {
                return checkedItem;
            }
        }
        return null;
    }

    public int findItemInt(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (itemName.equals(items.get(i).getName())) {
                return i;

            }
        }
        return -1;
    }

    public boolean removeItem(String itemName) {
        if (findItem(itemName) != null) {
            items.remove(findItemInt(itemName));
            return true;
        }
        return false;
    }

}
