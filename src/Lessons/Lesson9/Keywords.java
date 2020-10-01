package Lessons.Lesson9;

public class Keywords {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 101;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        } else {
            System.out.println("Your score was not 5000");
        }
        if (bonus == 100) {
            System.out.println("You get a bonus");
        } else {
            System.out.println("You suck");
        }

        if (gameOver) {
            int finalscore = (score + levelCompleted) * bonus;
            System.out.println("Your final score is " + finalscore + ".");

        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalscore = (score + levelCompleted) * bonus;
            System.out.println("Your second final score is " + finalscore + ".");


        }
    }

}
