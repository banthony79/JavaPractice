package ComIT.Practice7.Person;

public class Person {

    private String name;
    private int age;
    private char gender;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        if (age < 0 || age > 100) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
        this.gender = 'M';
        this.weight = weight;
        this.height = height;
    }

    public boolean over18() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public double healthyWeight() {
         double bmi = (weight / 2.2) / (Math.pow(height,2));
         return bmi;
    }

}
