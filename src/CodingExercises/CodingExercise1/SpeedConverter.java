package CodingExercises.CodingExercise1;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid entry");
        } else {
            long milesperHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h" + " = " + milesperHour + " mi/h");
        }

    }


}