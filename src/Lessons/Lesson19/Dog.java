package Lessons.Lesson19;

public class Dog extends Lessons.Lesson19.Animal {

    //create a base class and you can extend that class into other classes

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int tail, int eyes, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;


    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Animal.chew() called");
    }

    public void walk() {
        System.out.println("dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("dog.run() called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(5);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.movelegs called");
    }
}
