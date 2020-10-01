package Challenges.Challenge4;

public class HighScore {

    public static void displayHighScorePostion(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score table ");
    }

    public static int calculateHighScore(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScore(1500);
        displayHighScorePostion("Bryce", highScorePosition);
        highScorePosition = calculateHighScore(900);
        displayHighScorePostion("Bryce", highScorePosition);
        highScorePosition = calculateHighScore(400);
        displayHighScorePostion("Bryce", highScorePosition);
        highScorePosition = calculateHighScore(50);
        displayHighScorePostion("Bryce", highScorePosition);
    }

}


