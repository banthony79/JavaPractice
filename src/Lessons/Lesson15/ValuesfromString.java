package Lessons.Lesson15;

public class ValuesfromString {

    public static void main(String[] args) {
        String numberAsString = "2019";
        System.out.println("Number as String " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("NumberasString = " + numberAsString);
        System.out.println("Number = " + number);


        //can use other data types like double

        String doubleAsString = "2019.25";
        double doubleNumber = Double.parseDouble(doubleAsString);
        System.out.println("Double as String " + doubleAsString);
        System.out.println("Double as number " + doubleNumber);
    }
}
