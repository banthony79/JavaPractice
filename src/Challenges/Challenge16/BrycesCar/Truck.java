package Challenges.Challenge16.BrycesCar;

public class Truck extends Car {

    private int towingCapacity;
    private String size;
    private boolean is4x4;

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public String getSize() {
        return size;
    }

    public boolean isIs4x4() {
        return is4x4;
    }

    public Truck(String make, String model, int doors, int towingCapacity, boolean is4x4, String size) {
        super(make, model, doors, true);
        this.towingCapacity = towingCapacity;
        this.size = size;
        this.is4x4 = is4x4;
    }

    public void offRoading(int speed) {
        System.out.println(is4x4);
        if (!is4x4) {
            System.out.println("Vehicle is not 4 x 4");
        } else if (speed > 20) {
            System.out.println("You are going too fast to offroad");
        } else {
            System.out.println("You are offroading");

        }
    }

    public void tow(int weightOfTow, String tow) {
        if (towingCapacity < weightOfTow) {
            System.out.println("The tow exceeds the towing capacity");
        } else {
            System.out.println("You are towing a " + tow);
        }
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("The truck is moving at " + speed);
    }

    public void towWhileMoving(int speed, int weightOfTow, String tow) {
        move(speed);
        tow(weightOfTow, tow);
        System.out.println("The truck is towing a " + tow + " at " + speed);
    }
}
