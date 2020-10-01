package ComIT.Practice7.Person;

public class Main {

    public static void main(String[] args) {

        Person bryce = new Person("Bryce Looyenga", 40, 210, 176);

        System.out.println(bryce.over18());
        System.out.println(bryce.healthyWeight());
    }
}
