package Challenges.Challenge16.BrycesCar;

public class SportsCar extends Car {

    private int topSpeed;
    boolean isConvertiable;
    private int howManySpeed;

    public SportsCar(String make, String model, int topSpeed, boolean isConvertiable, int howManySpeed) {
        super(make, model, 2, false);
        if (topSpeed > 300 || topSpeed < 100) {
            System.out.println("Invalid number");
        } else {
            this.topSpeed = topSpeed;
        }
        this.isConvertiable = isConvertiable;
        if (howManySpeed < 5 || howManySpeed > 6) {
            System.out.println("Transmissions can only be 5 or 6 speed");
        } else {
            this.howManySpeed = howManySpeed;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public boolean isConvertiable() {
        return isConvertiable;
    }

    public int getHowManySpeed() {
        return howManySpeed;
    }

    public void race(int speed) {
        move(speed);
        if (speed > topSpeed) {
            System.out.println("The car cannot go that fast.");

        } else {
            System.out.println("The car is racing!");
        }
    }

    public boolean putTopDown(boolean topDown) {
        if (!isConvertiable) {
            System.out.println("Vehicle is not a convertiable");
        } else if (topDown) {
            System.out.println("The top is down, feel that air!");
            return true;
        } else {
            System.out.println("The top is up, it's getting cold out");
            return false;
        }
        return false;
    }

}
