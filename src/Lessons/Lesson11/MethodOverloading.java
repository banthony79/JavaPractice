package Lessons.Lesson11;

public class MethodOverloading {

    public static void main(String[] args) {
        int NewScore = CalculateScore("Bryce", 500);
        CalculateScore(75);
        CalculateScore();

    }

    public static int CalculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored" + score + " points");
        return score * 1000;
    }

    public static int CalculateScore(int score) {
        System.out.println("Unnamed player score " + score + " points");
        return score * 1000;


    }

    public static int CalculateScore() {
        System.out.println("Unnamed player scored no points");
        return 0;

    }

}