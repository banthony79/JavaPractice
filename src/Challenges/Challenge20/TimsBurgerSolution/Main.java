package Challenges.Challenge20.TimsBurgerSolution;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition("tomato", .27);
        hamburger.addHamburgerAddition2("Lettuce", .75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        price = hamburger.itemizeHamburger();
        System.out.println("Total Burger price is " + price);


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition("Egg", 3.00);
        healthyBurger.addHealthAddition("Lentils", 3.71);

        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.itemizeHamburger();


    }
}
