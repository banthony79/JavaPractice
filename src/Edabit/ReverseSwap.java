package Edabit;

//determine if the number swapped is larger than the original number

public class ReverseSwap {

    public static boolean largestSwap(int num) {

        if (num < inverseNumber(num)) {
		 return false;
        }
        return true;
    }


    public static int inverseNumber(int num) {
        int firstNumber = (num % 10 * 10);
        int secondNumber = (num / 10);


        return firstNumber + secondNumber;
    }
}
