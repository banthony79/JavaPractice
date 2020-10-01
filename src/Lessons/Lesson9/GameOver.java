package Lessons.Lesson9;

public class GameOver {

    public static void main(String[] args) {

        int score = 750;
        if (score >= 5000) {
            System.out.println("Your score was >= 5000");
        } else if (score < 1000 && score >= 500) {
            System.out.println("Your score was < 1000 but >= 500");
        } else {
            System.out.println("Your score was < 500");
        }
    }
}
