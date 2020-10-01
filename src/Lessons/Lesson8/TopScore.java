package Lessons.Lesson8;

public class TopScore {

    public static void main(String[] args) {
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("Congrats, you got the high score!");
        }

        int medScore = 90;
        if (medScore <= 90) {
            System.out.println("You got the medium score");
        }

        int thirdScore = 75;
        if (thirdScore < topScore && thirdScore < medScore) {
            System.out.println("You have a score.");

        }
    }
}