package Lessons.Lesson19;

public class Main {

    public static void main(String[] args) {

        Lessons.Lesson19.Animal animal = new Lessons.Lesson19.Animal("animal", 1, 1, 1, 1);
        Lessons.Lesson19.Dog dog = new Lessons.Lesson19.Dog("Yorkie", 20, 20, 1, 2, 20, "silky");

        dog.eat();
        //dog.walk();
        dog.run();

    }
}
