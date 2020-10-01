package Challenges.Challenge6;

public class Seconds2MinutesBonus {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value"; //constant

    public static String getDurationString(int minutes, int seconds) {
        if (minutes <= 0 || seconds <= 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingminutes = minutes % 60;
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = '0' + hoursString;
        }
        String minutesString = remainingminutes + "m";
        if (remainingminutes < 10) {
            minutesString = '0' + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = '0' + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString + "";


    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        System.out.println(minutes + " minutes");
        return getDurationString(minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 9));

    }
}
