package Challenges.Challenge19;

class Car {

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public Car(String name, int cylinders, int doors) {
        this.name = name;
        this.hasEngine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
    }

    public String name;
    public boolean hasEngine;
    public int cylinders;
    private int wheels;
    public int doors;
    public boolean isEngineRunning;
    public int speed;


    public void startEngine() {
        isEngineRunning = true;
        System.out.println("Engine is runnning.");

    }

    public void stopEngine() {
        isEngineRunning = false;
        System.out.println("Engine is turned off");
    }

    public void drive(int speed) {
        if (!isEngineRunning) {
            System.out.println("Vehicle must be turned on");
        } else {
            System.out.println("Vehicle is driving at " + speed + " kph.");
        }
    }

    public void stop() {
        speed = 0;
        System.out.println("Vehicle is stopped");
    }

}


class Corvette extends Car {
    public Corvette(String name, int cylinders, int doors) {
        super(name, cylinders, doors);
    }


    @Override
    public void drive(int speed) {
        System.out.println("The Corvette is driving at " + speed);
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("The Corvette has stopped");
    }
}

class Golf extends Car {

    public Golf(String name, int cylinders, int doors) {
        super(name, cylinders, doors);
    }

    @Override
    public void drive(int speed) {
        System.out.println("The Golf is driving " + speed + " kph");
    }
}

class ShittyCar extends Car {
    public ShittyCar(String name, int cylinders, int doors) {
        super(name, cylinders, doors);
    }

    @Override
    public void startEngine() {
        isEngineRunning = true;
        System.out.println("The " + getName() + " engine is running.");
    }

    @Override
    public void drive(int speed) {
        if (speed < 0 || speed > 30) {
            System.out.println(getName() + " cannot go that fast.");
        } else {
            System.out.println(getName() + " is driving");
        }
    }


    public static void main(String[] args) {

        Car car = new Car("Corrola", 4, 4);
        car.startEngine();
        car.drive(30);
        car.stop();
        car.stopEngine();
        Car corvette = new Corvette("Corvette", 6, 2);
        corvette.startEngine();
        corvette.drive(30);
        corvette.stop();
        corvette.stopEngine();
        Golf golf = new Golf("Golf", 4, 2);
        golf.startEngine();
        golf.drive(30);
        golf.stop();
        golf.stopEngine();
        ShittyCar shittyCar = new ShittyCar("POS", 2, 1);
        shittyCar.startEngine();
        shittyCar.drive(15);
        shittyCar.stop();
        shittyCar.stopEngine();


    }

}

