//Create a function that takes two strings as arguments and return either true or false depending on whether the 
//total number of characters in the first string is equal to the total number of characters in the second string.


package JavaChallenges;

public class StringLengthChecker {
    public static boolean StringLengthChecker(String s1, String s2) {
        int s1length = s1.length();
        int s2length = s2.length();
        if (s1length == s2length) {
            System.out.println("Words match in length.");
            return true;
        } else {
            System.out.println("Words don't match in length");
            return false;
        }
    }

    public static void main(String[] args) {
        StringLengthChecker("Bryce", "House");
        StringLengthChecker("Chicken", "Moon");
    }
}

