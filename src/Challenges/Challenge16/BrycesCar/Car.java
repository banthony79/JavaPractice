package Challenges.Challenge16.BrycesCar;

public class Car {

    private String make;
    private String model;
    private int doors;
    private boolean isAutomatic;

    public Car(String make, String model, int doors, boolean isAutomatic) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.isAutomatic = isAutomatic;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void move(int speed) {
        System.out.println("The car is moving at " + speed);
    }

    public void setGear(int gearNumber) {
        if ((!isAutomatic) && gearNumber > 1 && gearNumber < 7) {
            System.out.println("Car is now in gear " + gearNumber);
        } else System.out.println("Car is not an automatic or invalid gear number");
    }


}
