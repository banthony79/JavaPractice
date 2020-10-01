package Challenges.Challenge30.BrycesSolution;

import java.util.ArrayList;

public class CFLLeague<T> extends League {

    //public class Team<T extends Player> implements Comparable<Team<T>>{


    public CFLLeague(String name, int numberOfGames, int maxScore) {
        super(name, numberOfGames, maxScore);
    }

    @Override
    public ArrayList<Team> getTeams() {
        return super.getTeams();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void seasonSimulator(ArrayList<Team> teams) {
        super.seasonSimulator(teams);
    }

    @Override
    public boolean addTeam(String teamName) {
        return super.addTeam(teamName);
    }

    @Override
    public Team findTeam(String teamName) {
        return super.findTeam(teamName);
    }
}
