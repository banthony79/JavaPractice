package July13;

public class PlayingwithNumbers {

    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 25;
        int answer1;
        int answer2;
        boolean answer3;

        answer1 = deductNumbers(num1, num2);
        System.out.println(answer1);
        answer2 = sumofNumbers(num1, num2);
        System.out.println(answer2);
        answer3 = numbersAreequal(num1, num2);
        System.out.println(answer3);
    }

    public static int deductNumbers(int x, int y) {
        int ans = x - y;
        return ans;
    }

    public static int sumofNumbers(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static boolean numbersAreequal (int b, int l) {
        if (b == l) return true;
        else return false;
    }
}
