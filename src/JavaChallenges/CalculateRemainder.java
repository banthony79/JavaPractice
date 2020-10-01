package JavaChallenges;

//There is a single operator in Java, capable of providing the remainder of a division operation. Two numbers are passed as parameters.
//The first parameter divided by the second parameter will have a remainder, possibly zero. Return that valu

public class CalculateRemainder {

    public static void Remainder(int num1, int num2) {
        int remainder = (num1 % num2);
        System.out.println("The remainder of the two integers is " + remainder + ".");
    }

    public static void main(String[] args) {

        Remainder(5, 10);
        Remainder(4, 5);
        Remainder(3, 4);
        Remainder(-9, 45);

    }

}

 