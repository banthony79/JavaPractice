package Lessons.Lesson7;

public class OperandsExample {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousresult = result;
        System.out.println("Previous result was " + previousresult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + previousresult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println("4 % 3 = " + result);
        //result = 1 + 1
        result++;
        System.out.println("1 + 1 = " + result);
        //Result = 2 - 1
        result--;
        System.out.println("2 - 1 = " + result);
        //Result = 1 + 2
        result += 2;
        System.out.println("1 + 2 = " + result);
        //Result = 3 * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);
        //Result = 3/10
        result /= 3;
        System.out.println("10 / 3 = " + result);

    }
}