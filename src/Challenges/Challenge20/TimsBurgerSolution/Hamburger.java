package Challenges.Challenge20.TimsBurgerSolution;

public class Hamburger {

    public Hamburger(String name, String meat, double price, String breadroll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadroll = breadroll;
    }

    private String name;
    private String meat;
    public double price;
    private String breadroll;

    private String additionName1;
    private double addition1Price;

    private String additionName2;
    private double addition2Price;

    private String additionName3;
    private double addition3Price;

    private String additionName4;
    private double addition4Price;

    public void addHamburgerAddition(String name, double price) {
        this.additionName1 = name;
        this.addition1Price = price;

    }

    public void addHamburgerAddition2(String name, double price) {
        this.additionName2 = name;
        this.addition2Price = price;

    }

    public void addHamburgerAddition3(String name, double price) {
        this.additionName3 = name;
        this.addition3Price = price;
    }


    public void addHamburgerAddition4(String name, double price) {
        this.additionName4 = name;
        this.addition4Price = price;

    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + breadroll + " roll "
                + " price is " + this.price);
        if (this.additionName1 != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added: " + additionName1 + " for an extra " + this.addition1Price);
        }
        if (this.additionName2 != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added: " + additionName2 + " for an extra " + this.addition2Price);
        }
        if (this.additionName3 != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added: " + additionName3 + " for an extra " + this.addition3Price);
        }
        if (this.additionName4 != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added: " + additionName4 + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}
