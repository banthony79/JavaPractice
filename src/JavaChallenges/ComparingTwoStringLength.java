//Write a function that validates whether two strings are identical. Make it case insensitive.

package JavaChallenges;

public class ComparingTwoStringLength {

    public static boolean compareTwoStringsIgnoreCase(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("match");
            return true;
        } else {
            System.out.println("no bueno");
            return false;
        }
    }


    public static void main(String[] args) {
        compareTwoStringsIgnoreCase("Bryce", "bryce");
        compareTwoStringsIgnoreCase("Hello", "goodbye");

    }
}