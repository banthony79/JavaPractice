package Challenges.Challenge8;

public class PrintDay2 {

    public static void printDayOfTheWeekBonus(int dia) {
        if (dia == 1) System.out.println("Monday");
        else if (dia == 2) System.out.println("Tuesday");
        else if (dia == 3) System.out.println("Wednesday");
        else if (dia == 4) System.out.println("Thursday");
        else if (dia == 5) System.out.println("Friday");
        else if (dia == 6) System.out.println("Saturday");
        else if (dia == 7) System.out.println("Sunday");
        else System.out.println("Invalid entry");
    }

    public static void main(String[] args) {
        printDayOfTheWeekBonus(5);
        printDayOfTheWeekBonus(25);
        printDayOfTheWeekBonus(7);
    }

}
