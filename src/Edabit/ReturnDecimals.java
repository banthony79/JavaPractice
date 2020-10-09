package Edabit;

//A program that returns number decimal places

public class ReturnDecimals {

    public static int getDecimalPlaces(String num) {

        String newNum = num.substring(num.indexOf(".") + 1);

        if (newNum == num) {
		    return 0;
        } else if   (newNum.length() > 0) {
		 return newNum.length();
        }


    return -1; }

    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("3.1"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("43.21"));
    }
}


