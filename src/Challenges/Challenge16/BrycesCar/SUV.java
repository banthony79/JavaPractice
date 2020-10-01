package Challenges.Challenge16.BrycesCar;

public class SUV extends Truck {

    private int numberOfPassengers;

    public SUV(String make, String model, int doors, int towingCapacity, boolean is4x4, int numberOfPassengers) {
        super(make, model, doors, towingCapacity, is4x4, "1");
        if (numberOfPassengers > 10) {
            System.out.println("You have too many passengers");
        } else {
            this.numberOfPassengers = numberOfPassengers;
        }

    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

}
