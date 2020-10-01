package Challenges.Challenge30.TimsSolution;

import Lessons.Lesson33.Team.BaseballPlayer;

public class Main {

    public static void main(String[] args) {


        League<Team<FootballPlayer>> footballLeague = new League("CFL");

        Team<FootballPlayer> minnesotaVikings = new Team("Minnesota Vikings");
        FootballPlayer brandon = new FootballPlayer("Brandon Zylstra");
        Team<FootballPlayer> winnipegBlueBomers = new Team("Winnipeg BlueBombers");
        Team<FootballPlayer> calgaryStampeders = new Team("Calgary Stampeders");
        Team<BaseballPlayer> baseballTeam = new Team("Yankees");
        Team<FootballPlayer> saskatchewanRoughriders = new Team("Saskatchewan Roughriders");

        footballLeague.addTeam(minnesotaVikings);
        footballLeague.addTeam(winnipegBlueBomers);
        footballLeague.addTeam(calgaryStampeders);

        winnipegBlueBomers.matchResult(saskatchewanRoughriders, 14, 24);
        calgaryStampeders.matchResult(winnipegBlueBomers, 32, 14);
        minnesotaVikings.matchResult(saskatchewanRoughriders, 5, 15);
        // footballLeague.addTeam(baseballTeam);

        footballLeague.showLeagueTable();


        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.addTeam(rawTeam);     // unchecked warning

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.addTeam(minnesotaVikings);     // no warning
        rawLeague.addTeam(baseballTeam);    // no warning
        rawLeague.addTeam(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.addTeam(minnesotaVikings);     // unchecked warning
        reallyRaw.addTeam(baseballTeam);    // unchecked warning
        reallyRaw.addTeam(rawTeam);         // unchecked warning

    }
}
