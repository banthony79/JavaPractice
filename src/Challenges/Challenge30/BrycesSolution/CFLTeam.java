package Challenges.Challenge30.BrycesSolution;

import java.util.Random;

public class CFLTeam<T> extends Team {

    Random random = new Random();

    public CFLTeam(String name) {
        super(name);

    }

    @Override
    public String seasonString() {
        return super.seasonString();
    }

    @Override
    public void gameResults(int homeScore, int awayScore) {
        super.gameResults(homeScore, awayScore);
    }

    @Override
    public int scoreSimulator(int maxScore) {
        return super.scoreSimulator(maxScore);
    }


    @Override
    public int ranking() {
        return super.ranking();
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getWins() {
        return super.getWins();
    }

    @Override
    public int getLosses() {
        return super.getLosses();
    }

    @Override
    public int getTies() {
        return super.getTies();
    }

    @Override
    public int getGamesPlayed() {
        return super.getGamesPlayed();
    }
}
