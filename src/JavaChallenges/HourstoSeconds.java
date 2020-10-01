//Write a function that converts hours into seconds.

package JavaChallenges;

public class HourstoSeconds {

    public static void HowManySeconds(int hours) {
        int seconds = hours * 7200;
        System.out.println("There are " + seconds + " seconds in " + hours + " hours.");
    }

    public static void main(String[] args) {
        HowManySeconds(4);
        HowManySeconds(3);
    }
}



