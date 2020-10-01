package Challenges.Challenge20.TimsBurgerSolution;

public class HealthyBurger extends Hamburger {

    private String healthyExtraName2;
    private double healthyExtraPrice2;

    private String healthyExtraName;
    private double healthyExtraPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye");
    }

    public void addHealthAddition(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtraName != null) {
            hamburgerPrice += this.healthyExtraPrice;
            System.out.println("Added = " + this.healthyExtraName + " for an extra " + this.healthyExtraPrice);
        }
        if (this.healthyExtraName2 != null) {
            hamburgerPrice += this.healthyExtraPrice2;
            System.out.println("Added = " + this.healthyExtraName2 + " for an extra " + this.healthyExtraPrice2);
        }
        return hamburgerPrice;
    }
}
