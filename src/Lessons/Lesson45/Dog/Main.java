package Lessons.Lesson45.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Nipsy", 8);
        Dog pug = new Dog("Nipsy", 8);

        System.out.println(dog.equals(pug));
        System.out.println(pug.equals(dog));
    }


}
