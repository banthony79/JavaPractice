package HackerRank;

import java.util.Calendar;
import java.util.Scanner;

public class DayofWeekB {

    //second attempt

    public static Scanner scanner = new Scanner(System.in);

    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day - 1);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] dayArray = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
                "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

        return dayArray[dayOfWeek];
    }


    public static void main(String[] args) {

        System.out.println("Please enter the year");
        int year = scanner.nextInt();
        System.out.println("Please enter the month");
        int month = scanner.nextInt();
        System.out.println("Please enter the day");
        int day = scanner.nextInt();


        System.out.println(findDay(month, day, year));
    }

}
