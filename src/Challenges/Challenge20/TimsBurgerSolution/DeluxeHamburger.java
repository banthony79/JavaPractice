package Challenges.Challenge20.TimsBurgerSolution;

public class DeluxeHamburger extends Hamburger {
    @Override
    public void addHamburgerAddition(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public DeluxeHamburger() {
        super("Deluxe Hamburger", "Sausage and Bacon", 14.50, "White");
        super.addHamburgerAddition("Chips", 2.75);
        super.addHamburgerAddition("Drink", 1.81);


    }


}
