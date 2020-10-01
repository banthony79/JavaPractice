package Challenges.Challenge30.BrycesSolution;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class League {

    //private static ArrayList<String> standings = new ArrayList();

    private String name;
    private ArrayList<Team> teams;
    private int numberOfGames;
    private int maxScore;

    public League(String name, int numberOfGames, int maxScore) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.numberOfGames = numberOfGames;
        this.maxScore = maxScore;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void seasonSimulator(ArrayList<Team> teams) {
        ArrayList<Team> standings = new ArrayList<>();
        for (int i = 0; i < teams.size(); i++) {
            Team testTeam = teams.get(i);
            for (int j = 0; j < numberOfGames; j++) {
                testTeam.gameResults(testTeam.scoreSimulator(maxScore), testTeam.scoreSimulator(maxScore));
            }
            standings.add(i, testTeam);
            System.out.println(testTeam.getName() + " - Wins: " + testTeam.getWins() +
                    ", Losses: " + testTeam.getLosses() + ", Ranking: " + testTeam.ranking());
        }
    }


    public boolean addTeam(String teamName) {
        if (findTeam(teamName) == null) {
            return teams.add(new CFLTeam(teamName));
        }
        return false;
    }

    public Team findTeam(String teamName) {
        for (int i = 0; i < teams.size(); i++) {
            Team testTeam = teams.get(i);
            if (testTeam.getName().equals(teamName)) {
                return testTeam;
            }
            return null;
        }


        return null;
    }
}