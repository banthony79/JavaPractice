package Challenges.Challenge6;

public class Seconds2Minutes {

    public static String getDurationString(int minutes, int seconds) {
        if (minutes <= 0 || seconds <= 0 || seconds > 59) {
            System.out.println("Invalid Value");
            return "invalid value";
        }
        int hours = minutes / 60;
        int remainingminutes = minutes % 60;
        return hours + "h" + remainingminutes + "m" + seconds;
    }

    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            return "invalid value";
        }
        int minutes = seconds / 60;
        System.out.println(minutes + " minutes");
        return getDurationString(minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));

    }
}



