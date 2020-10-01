package JavaChallenges;

//Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.

public class LessThanZero {

    public static void GreaterThanZero(int num) {
        if (num > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {

        GreaterThanZero(5);
        GreaterThanZero(-2);
        GreaterThanZero(-25);
        GreaterThanZero(10);

    }

}