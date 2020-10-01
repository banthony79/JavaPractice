package PersonalStuff.Friends;

public class Beer extends Friend {

    public Beer(String firstName, String lastName, int age, String brand, double cost) {
        super(firstName, lastName, age);
        this.brand = brand;
        this.cost = cost;
    }

    private String brand;
    private double cost;


    public void beerCost(int beer) {
        double totalBeerCost = beer * cost;
        System.out.println(getFirstName() + " had " + beer + beer + " beer at a cost of "
                + totalBeerCost);
    }
}


