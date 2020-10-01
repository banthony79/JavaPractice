package JavaChallenges;

public class gamblingCalculator {

//Create a function that takes in three arguments (prob, prize, pay) and returns true if prob * prize > pay; otherwise return false.

    public static boolean probabilityCalculator(double prob, int prize, int pay) {

        double gamblingNumber = prob * prize;
        if (gamblingNumber > pay) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }

    public static void main(String[] args) {

        probabilityCalculator(.2, 50, 9);
        probabilityCalculator(0.9, 1, 2);

    }


}


