package Lessons.Lesson33.Menu;

public class Main {

    public static void main(String[] args) {

        Drink<Drink> ceaser = new Drink("Ceasar", 5.50);
        FoodItem<FoodItem> burger = new FoodItem("Burger", 8.00);
        Drink<Drink> rumAndCoke = new Drink("Rum and Coke", 2.50);
        FoodItem<FoodItem> fries = new FoodItem("Fries", 4.00);

        Menu<Drink> drinkMenu = new Menu("Drink Menu");
        Menu<FoodItem> foodMenu = new Menu("HashExample Menu");

        drinkMenu.addItem(ceaser);
        drinkMenu.addItem(rumAndCoke);
        foodMenu.addItem(burger);
        foodMenu.addItem(fries);


        foodMenu.showItems(foodMenu.getItems());
        System.out.println("===============");
        drinkMenu.showItems(drinkMenu.getItems());


    }
}
