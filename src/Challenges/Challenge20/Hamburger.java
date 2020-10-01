package Challenges.Challenge20;

import java.util.Scanner;

class BaseHamburger {

    public BaseHamburger(String name, String bun, int meat) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.lettuce = 3;
        this.tomato = 3;
        this.onion = 3;
        this.cheese = 1;
    }

    private String name;
    public String bun;
    public int meat;
    public int lettuce;
    public int tomato;
    public int onion;
    public int cheese;
    public double meatPrice = 2.50;
    public double lettucePrice = 1.00;
    public double tomatoPrice = .75;
    public double onionPrice = .50;
    public double cheesePrice = 1.50;
    public double baseprice = 5;

    public String getName() {
        return name;
    }


    public void addMeat(int meat) {
        meat = meat + this.meat;
        meatPrice = meat * meatPrice;
    }

    public void addLettuce(int lettuce) {
        lettuce = lettuce + this.lettuce;
        lettucePrice = lettuce * lettucePrice;
    }

    public void addTomatos(int tomato) {
        tomato = tomato + this.tomato;
        tomatoPrice = tomato * tomatoPrice;
    }

    public void addOnions(int onion) {
        onion = onion + this.onion;
        onionPrice = onion * onionPrice;

    }

    public void addCheese(int cheese) {
        cheese = cheese + this.cheese;
        cheesePrice = cheese * cheesePrice;

    }

    public double getPrice() {
        return baseprice + meatPrice + lettucePrice + tomatoPrice + onionPrice + cheesePrice;

    }
}

class HealthyHamburger extends BaseHamburger {
    public HealthyHamburger() {
        super("Healthy Hamburger", "Dark Rye", 1);
        this.guac = 1;
        this.cucumbers = 4;

    }

    private int guac;
    private int cucumbers;
    private double cucumberPrice = .25;
    private double guacPrice = 2.00;

    @Override
    public String getName() {
        return super.getName();
    }

    public void addGuac(int guac) {
        guac = guac + this.guac;
        guacPrice = guac * guacPrice;

    }

    public void addCucumbers(int cucumbers) {
        cucumbers = cucumbers + this.cucumbers;
        cucumberPrice = cucumberPrice * cucumbers;
    }

    @Override
    public double getPrice() {
        return baseprice + meatPrice + lettucePrice + tomatoPrice + onionPrice +
                cheesePrice + guacPrice + cucumberPrice;
    }

}

class DeluxeHamburger extends BaseHamburger {

    public DeluxeHamburger() {
        super("Deluxe Hamburger", "Sesame", 1);
        this.chips = 1;
        this.pop = 1;

    }

    private int chips;
    private int pop;
    private double priceChipsNPop = 3.50;

    @Override
    public double getPrice() {
        return baseprice + meatPrice + lettucePrice + tomatoPrice + onionPrice +
                cheesePrice + priceChipsNPop;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void addMeat(int meat) {
        System.out.println("No extra toppings are allowed on the deluxe hamburger");
    }

    @Override
    public void addLettuce(int lettuce) {
        System.out.println("No extra toppings are allowed on the deluxe hamburger");
    }

    @Override
    public void addTomatos(int tomato) {
        System.out.println("No extra toppings are allowed on the deluxe hamburger");
    }

    @Override
    public void addOnions(int onion) {
        System.out.println("No extra toppings are allowed on the deluxe hamburger");
    }

    @Override
    public void addCheese(int cheese) {
        System.out.println("No extra toppings are allowed on the deluxe hamburger");
    }
}









