package July10;

public class ITry {

    public static void main(String[] args) {
        int result = divide(1, 0);
        if (result != Integer.MIN_VALUE) {
        }
    }
    public static int divide(int numerator, int denominator) {
        try {
            return numerator/denominator;
        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("No bueno");
            return Integer.MIN_VALUE;
        }
    }

}
