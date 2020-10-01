package Challenges.Challenge30.BrycesSolution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public abstract class Team<T> {

    private String name;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private int gamesPlayed = 0;
    private int ranking;


    Random random = new Random();


    public Team(String name) {
        this.name = name;
        this.ranking = ranking();

    }

    public void gameResults(int homeScore, int awayScore) {
        if (homeScore > awayScore) {
            wins++;
        } else if (homeScore < awayScore) {
            losses++;
        } else {
            ties++;
        }
        gamesPlayed++;

    }

    public int ranking() {
        return wins * 2 - losses;
    }

    public int scoreSimulator(int maxScore) {
        return random.nextInt(maxScore);
    }

    public String seasonString() {
        return name + " Season " + "Wins: " + wins + ", Losses: "
                + losses + ", Games Played: " + gamesPlayed + ", Ranking: " + ranking();
    }


    public String showRankings() {
        return name + ":" + ranking();
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }
}
