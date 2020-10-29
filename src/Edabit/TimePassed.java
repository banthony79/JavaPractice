package Edabit;

public class TimePassed {
    
    public static String hoursPassed(String t1, String t2) {


        int timeOne = timeConverter(t1);
        int timeTwo = timeConverter(t2);

        int timePassed = timeTwo - timeOne;

        if (timePassed == 0) {
            return "no time passed";
        }

        return timePassed + " hours";	}



    public static void main(String[] args) {

        System.out.println(hoursPassed("12:00 AM", "10:00 AM"));


    }

    public static boolean amOrPm(String time, int charPosition) {

        char x = time.charAt(charPosition);

        if (x == 'P') {
            return true;
        }
        return false; }

    public static int timeConverter(String time) {
        int hour = 0;
        char ampm = '|';

        if (time.length() == 7) {
            String x = String.valueOf(time.charAt(0));
            hour = Integer.valueOf(x);
        }

        ampm = time.charAt(5);

        if (amOrPm(time, 5)) {
            hour = hour + 12;
            return hour;
        }

        if (time.equals("12:00 AM")) {
            return 0;
        }

        if (time.length() == 8) {
            String x = String.valueOf(time.charAt(0)) + String.valueOf(time.charAt(1));
            hour = Integer.valueOf(x);
        }

        if (amOrPm(time, 6)) {
            hour = hour + 12;
            return hour;
        }






        return hour; }
}
