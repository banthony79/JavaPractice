package Challenges.Challenge16.BrycesCar;

public class Main {

    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "Corolla", 4, true);
        Truck ford = new Truck("Ford", "150", 4, 20000, true, "1/2 ton");
        SportsCar porsche = new SportsCar("Porsche", "911", 200, true, 5);
        SUV explorer = new SUV("Ford", "Explorer", 4, 25000, true, 7);


        //toyota.move(15);
        ford.towWhileMoving(30, 18000, "motorboat");
        //porsche.race(180);
        //ford.offRoading(25);
        //explorer.tow(20000, "camper");
        porsche.putTopDown(true);
        toyota.setGear(4);
        explorer.move(30);

    }
}
