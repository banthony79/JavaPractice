package PersonalStuff.BrycesPizza;


import java.util.HashMap;
import java.util.LinkedList;

public class Menu {

    private LinkedList<MenuItem> menu;


    public Menu() {
        this.menu = new LinkedList<>();
    }

    public LinkedList<MenuItem> getMenu() {
        return menu;
    }

    public boolean addItem(MenuItem item) {
        return menu.add(item);
    }

    public boolean addPizza(Pizza pizza) {
        return menu.add(pizza);

    }

    public MenuItem returnItembyNumber(int itemNumber) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getItemNumber() == itemNumber) {
                return menu.get(i);
            }
        }
        System.out.println("That item doesn't exist");
        return null;
    }


    public void showMenu() {
        showPizzas();
        showWings();
    }

    private void showWings() {
        System.out.println("WING FLAVOURS");
        System.out.println("All wings 9.99/pound, wing flavours include: ");
        for (MenuItem item : menu) {
            if (item instanceof Wing) {
                System.out.println(((Wing) item).itemDescription());
            }
        }
        System.out.println("====================");
    }

    private void showPizzas() {
        System.out.println("PIZZA FLAVOURS");
        System.out.println("SMALL" + "\t" + "7.00" + "\t" +
                "MEDIUM" + "\t" + "10.00" + "\t" + "LARGE" + "\t" + "15.00" + "\t" + "EXTRA LARGE" + "\t" + "20.00");
        for (MenuItem item : menu) {
            if (item instanceof Pizza) {
                MenuItem newPizza = (Pizza) item;
                System.out.println(newPizza.itemDescription());
            }
        }
        System.out.println("====================");
    }



    public Pizza returnPizza(int itemNumber) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getItemNumber() == itemNumber) {
                if (menu.get(i) instanceof Pizza) {
                    return (Pizza) menu.get(i);
                }
            }

        }
        return null;
    }
}

