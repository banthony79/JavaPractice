package JavaChallenges;

//Create a function that takes an integer and returns true if it's divisible by 100, otherwise return false.


public class divisibleBy100 {

    public static boolean divisibleby100(int num1) {

        if (num1 % 100 == 0) {
            System.out.println("true");
            return true;

        }
        System.out.println("false");
        return false;

    }

    public static void main(String[] args) {

        divisibleby100(500);
        divisibleby100(50);
        divisibleby100(20);

        divisibleby100(600);

    }

}