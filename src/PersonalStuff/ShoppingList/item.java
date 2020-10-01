package PersonalStuff.ShoppingList;

public class item {

    private String itemName;
    private double itemPrice;

    public item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public item createItem(String item, double itemPrice) {
        return new item(item, itemPrice);
    }


}
