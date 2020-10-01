//Write a function that takes an integer and returns a string with the given number of "a"s in Edabit.
package JavaChallenges;

public class Edabit {

    public static int countingStrings(String S1) {
        char someChar = 'a';
        int count = 0;

        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        countingStrings("Edaaaaabit");
        countingStrings("Edbit");
    }
}