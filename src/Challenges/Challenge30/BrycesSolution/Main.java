package Challenges.Challenge30.BrycesSolution;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        League CFLLeague = new CFLLeague("CFL", 18, 50);
        League MLBLeague = new MLBLeague("MLB", 162, 15);


        CFLLeague.addTeam("Saskatchewan Roughriders");
        CFLLeague.addTeam("Calgary Stampeders");
        CFLLeague.addTeam("Winnipeg Bluebombers");
        CFLLeague.addTeam("Hamilton TigerCats");
        CFLLeague.addTeam("Ottawa REDBLACKS");
        CFLLeague.addTeam("Edmonton Eskimoes");
        CFLLeague.addTeam("BC Lions");
        CFLLeague.addTeam("Toronto Argonauts");
        CFLLeague.addTeam("Montreal Alouettes");


        MLBLeague.addTeam("Atlanta Braves");
        MLBLeague.addTeam("Miami Marlins");
        MLBLeague.addTeam("New York Mets");
        MLBLeague.addTeam("Philadelphia Phillies");
        MLBLeague.addTeam("Washington Nationals");
        MLBLeague.addTeam("Chicago Cubs");
        MLBLeague.addTeam("Cincinnati Reds");
        MLBLeague.addTeam("Milwaukee Brewers");
        MLBLeague.addTeam("Pittsburgh Pirates");
        MLBLeague.addTeam("St. Louis Cardinals");
        MLBLeague.addTeam("Arizona Diamondbacks");
        MLBLeague.addTeam("Colorado Rockies");
        MLBLeague.addTeam("Los Angeles Dodgers");
        MLBLeague.addTeam("San Diego Padres");
        MLBLeague.addTeam("New York Yankees");


        //CFLLeague.seasonSimulator(CFLLeague.getTeams());
        MLBLeague.seasonSimulator(MLBLeague.getTeams());
        System.out.println("======================");
        CFLLeague.seasonSimulator(CFLLeague.getTeams());

    }


}
