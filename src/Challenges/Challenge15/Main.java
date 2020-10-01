package Challenges.Challenge15;

public class Main {

    public static void main(String[] args) {

        VipCustomer bryce = new VipCustomer();
        VipCustomer ashley = new VipCustomer("Ashley Lonson", 1000, "ashley@yahoo.com");
        VipCustomer jasmine = new VipCustomer("Jasmine the cat", 1000);


        System.out.println("The default credit limit is " + bryce.getCreditLimit());
        System.out.println(ashley.getName() + " email is " + ashley.getEmailAddress());
        System.out.println(jasmine.getName() + " credit limit is " + jasmine.getCreditLimit());

    }
}
