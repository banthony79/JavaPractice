package PersonalStuff.BrycesPizza;

public class MenuItem {

    private int itemNumber;
    private final String itemName;
    private final double itemPrice;

    public MenuItem(String itemName, double itemPrice, int itemNumber) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        if (this instanceof Pizza) {
            Pizza pizza = (Pizza) this;
            return pizza.getPrice();

        } else {
            return itemPrice;
        }

    }

    public int getItemNumber() {
        return itemNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != (this.getClass()))) {
            return false;
        }

        String objName = ((MenuItem) obj).getItemName();

        return this.itemName.equals(objName);


    }

    public String itemDescription() {
        return itemNumber + ": " + itemName;
    }
}
