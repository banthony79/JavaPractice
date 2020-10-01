package Challenges.Challenge16.TimsVehicle;

public class Vehicle {

    private String name;
    private String size;

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    private int currentVelocity;
    private int currentDirection;

    public int getCurrentDirection() {
        return currentDirection;
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void Steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() steering at " + currentDirection);

    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
