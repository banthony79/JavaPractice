package Challenges.Challenge3;

public class OperatorChallenge {

    public static void main(String[] args) {

        double value = 20.00;
        double secondvalue = 80.00;
        double sum = (value + secondvalue) * 100;
        System.out.println("The sum is " + sum);
        double remainder = sum % 40;
        System.out.println("The remainder is " + remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println("isZero = " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }

}
