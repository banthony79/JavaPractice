package Lessons.Lesson39.Restaurant;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Bryce's Diner", 8);


        restaurant.getTables();

        //restaurant.reserveByTableNumber(5);
        //restaurant.reserveByTableNumber(8);

        restaurant.reserveByTableSize(4);

    }
}
