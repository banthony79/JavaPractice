package Lessons.Lesson10;

public class MethodExample {

    public static void CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalscore + ".");
        }
    }

    public static void main(String[] args) {

        CalculateScore(true, 100, 5, 75);
        CalculateScore(true, 2000, 6, 125);
    }

}

