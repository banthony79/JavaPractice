package Edabit;

public class MeanOfAllDigits {

    //Find the average of all the digits of a number

    public static int mean(int a) { //calculate average

        int [] newArray = makeStringIntoNumbers(makeNumbersIntoArray(a));

        int sum = 0;
        for (Integer number: newArray) {
        sum+=number;
        }


        return sum/newArray.length; 	}

    public static void main(String[] args) {
        System.out.println(mean(12345));
    }

    public static String[] makeNumbersIntoArray(int number) {

        //make all numbers in an array of Strings to seperate them

        String stringFromNumber = String.valueOf(number);
	 String [] array = new String [stringFromNumber.length()];
	 for (int i = 0; i < stringFromNumber.length(); i++) {
	 array[i] = String.valueOf(stringFromNumber.charAt(i));
	 }
        return array;
    }

     public static int [] makeStringIntoNumbers(String [] arr) {

        //convert all items in array back to ints

        int [] numbers = new int [arr.length]; //make all
        for (int i = 0; i < arr.length; i++) {
         numbers[i] = Integer.valueOf(arr[i]);
        }
    return numbers;  }
}
