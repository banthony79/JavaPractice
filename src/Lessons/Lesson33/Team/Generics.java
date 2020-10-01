package Lessons.Lesson33.Team;

public class Generics {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> saskatchewanRoughriders = new Team<>("Saskatchewan Roughriders");

        saskatchewanRoughriders.addPlayer(joe);
        // saskatchewanRoughriders.addPlayer(pat);
        // saskatchewanRoughriders.addPlayer(beckham);

        System.out.println(saskatchewanRoughriders.numPlayers());

        Team<BaseballPlayer> newYorkYankees = new Team<>("New York Yankees");
        newYorkYankees.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team("This won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> minnesotaVikings = new Team("Minnesota Vikings");
        FootballPlayer brandon = new FootballPlayer("Brandon Zylstra");
        minnesotaVikings.addPlayer(brandon);

        Team<FootballPlayer> winnipegBlueBomers = new Team("Winnipeg BlueBombers");
        Team<FootballPlayer> calgaryStampeders = new Team("Calgary Stampeders");

        winnipegBlueBomers.matchResult(saskatchewanRoughriders, 14, 24);
        calgaryStampeders.matchResult(winnipegBlueBomers, 32, 14);
        minnesotaVikings.matchResult(saskatchewanRoughriders, 5, 15);

        System.out.println(minnesotaVikings.getName() + ", ranking: " + minnesotaVikings.ranking());
        System.out.println(saskatchewanRoughriders.getName() + ", ranking: " + saskatchewanRoughriders.ranking());
        System.out.println(winnipegBlueBomers.getName() + ", ranking: " + winnipegBlueBomers.ranking());
        System.out.println(calgaryStampeders.getName() + ", ranking: " + calgaryStampeders.ranking());

        System.out.println(minnesotaVikings.compareTo(saskatchewanRoughriders));
        System.out.println(saskatchewanRoughriders.compareTo(minnesotaVikings));
        System.out.println(saskatchewanRoughriders.compareTo(calgaryStampeders));


    }
}
