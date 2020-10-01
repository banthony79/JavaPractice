package CodingExercises.CodingExercise5;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if (((int) (num1 * 1000) == (int) (num2 * 1000))) {
            System.out.println(num1 + " is equal to " + num2);
            return true;
        } else {
            System.out.println(num1 + " is not equal to " + num2);
            return false;
        }

    }
}


//3.1567 * 1000 = 3,156.7 so by casting the double to an int you are eliminating that decimal on the end