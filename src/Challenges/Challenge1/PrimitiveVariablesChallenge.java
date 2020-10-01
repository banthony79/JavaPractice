package Challenges.Challenge1;

public class PrimitiveVariablesChallenge {


    public static void main(String[] args) {

        byte byteNumber = 57;
        short shortNumber = 2000;
        int intNumber = 215722;
        int myTotal = (byteNumber + shortNumber + intNumber) * 10;

        Long myTotalNumber = (long) (50000 + myTotal);

        System.out.println(myTotalNumber);

    }
}