package JavaChallenges;

public class TheFarmProblem {

    public static int HowManyLegs(int chickens, int cows, int pigs) {
        int chickenLegs = chickens * 2;
        int cowLegs = cows * 4;
        int pigLegs = pigs * 4;
        int totalLegs = chickenLegs + cowLegs + pigLegs;
        System.out.println("You have " + chickens + " chickens.");
        return totalLegs;
    }

    public static void main(String[] args) {
        HowManyLegs(2, 5, 10);
        HowManyLegs(2, 0, 0);
    }

}
