package JavaChallenges;


public class isStringEmpty {

    public static boolean isEmpty(String stringtext) {
        int a = stringtext.length();
        if (a == 0) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {

        isEmpty("");
        isEmpty("Bryce");
        isEmpty("Inland");

    }
}
   