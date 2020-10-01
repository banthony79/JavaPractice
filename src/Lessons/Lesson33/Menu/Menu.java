package Lessons.Lesson33.Menu;

import java.util.ArrayList;

public class Menu<T extends Product> {

    String name;

    public Menu(String name) {
        this.name = name;
    }

    private ArrayList<T> items = new ArrayList<>();

    public boolean addItem(T product) {
        if (items.contains(product)) {
            System.out.println("Product already exists");
            return false;
        } else {
            items.add(product);
            return true;

        }
    }

    public void showItems(ArrayList<T> menu) {
        System.out.println(name);
        for (int i = 0; i < menu.size(); i++) {
            T testProduct = menu.get(i);
            System.out.println(testProduct.toString());
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getItems() {
        return items;
    }
}
