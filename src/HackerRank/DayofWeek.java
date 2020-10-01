package HackerRank;

import java.util.Calendar;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;
import java.util.TimeZone;

public class DayofWeek {

    public static Scanner scanner = new Scanner(System.in);

    public static String findDay(int month, int day, int year) {

        String dayString = "";
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayofWeek = date.getDayOfWeek();

        switch (dayofWeek) {

            case MONDAY:
                dayString = "MONDAY";
                break;
            case TUESDAY:
                dayString = "TUESDAY";
                break;
            case WEDNESDAY:
                dayString = "WEDNESDAY";
                break;
            case THURSDAY:
                dayString = "THURSDAY";
                break;
            case FRIDAY:
                dayString = "FRIDAY";
                break;
            case SATURDAY:
                dayString = "SATURDAY";
                break;
            case SUNDAY:
                dayString = "SUNDAY";
                break;

        }
        return dayString;
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



