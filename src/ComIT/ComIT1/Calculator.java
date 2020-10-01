
package ComIT.ComIT1;

public class Calculator {


    public static String Calc(int x, int y, char operand) {

        int add = x + y;
        int subtract = x - y;
        int divide = x / y;
        int multiply = x * y;
        if (operand == '+') return x + " " + operand + " " + y + " = " + add;
        else if (operand == '-') return x + " " + operand + " " + y + " = " + subtract;
        else if (operand == '*') return x + " " + operand + " " + y + " = " + multiply;
        else if (operand == '/') return x + " " + operand + " " + y + " = " + divide;
        else return "none";
    }


    public static void main(String[] args) {
        System.out.println(Calc(5, 6, '+'));
        System.out.println(Calc(20, 6, '-'));
        System.out.println(Calc(6, 6, '*'));
        System.out.println(Calc(45, 5, '/'));
    }

}
