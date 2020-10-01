package Lessons.Lesson32;

public class Main {


    public static void main(String[] args) {
        Dog dog = new Dog("Lab");
        dog.eat();
        dog.breath();
        Parrot parrot = new Parrot("African Grey");
        parrot.eat();
        parrot.breath();
        Penguin penguin = new Penguin("Emporer");
        penguin.fly();

    }
}
