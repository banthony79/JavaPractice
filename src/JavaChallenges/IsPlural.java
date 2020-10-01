package JavaChallenges;
//Create a function that takes in a word and determines whether or not it is plural. A plural word is one that ends in "s".

public class IsPlural {

    public static boolean PluralChecker(String S1) {
        char lastcharacter = S1.charAt(S1.length() - 1);
        if (lastcharacter == 's') {
            System.out.println("Word is plural");
            return true;
        } else {
            System.out.println("Word is not plural");
            return false;
        }

    }

    public static void main(String[] args) {
        PluralChecker("books");
        PluralChecker("chicken");
    }
}