package JavaChallenges;

//Write a function that returns true if k^k == n for input (n, k).

public class kTok {

    public static boolean Ktok(double num1, double num2) {
        double expoNum = Math.pow(num2, num2);
        if (expoNum == num1) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }


    public static void main(String[] args) {
        Ktok(4, 2);
        Ktok(387420489, 9);
        Ktok(17, 3);
    }
}