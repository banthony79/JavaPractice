package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class FoodIterator {

    private static LinkedList food = new LinkedList();


    public static void main(String[] args) {


        addFood(0, "hamburger");
        addFood(1, "toast");
        addFood(2, "celery");
        addFood(3, "kraft dinner");

        Iterator itr = food.iterator();

        while (itr.hasNext()) {
            System.out.println("Eating " + itr.next());
        }


    }


    private static void addFood(int index, String fooditem) {
        food.add(index, fooditem);
    }
}
