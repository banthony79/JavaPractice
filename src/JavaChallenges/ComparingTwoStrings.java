package JavaChallenges;

public class ComparingTwoStrings {

    public static boolean CompareTwoStrings(String S1, String S2) {
        if (S1 == S2) {
            System.out.println("match");
            return true;
        } else {
            System.out.println("doesn't match");
            return false;
        }
    }

    public static void main(String[] args) {
        CompareTwoStrings("hello", "hello");
        CompareTwoStrings("work", "Bryce");
        CompareTwoStrings("Bryce", "Bryce");
    }
}

