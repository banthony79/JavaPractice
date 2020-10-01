package Challenges.Challenge27.BrycesSolution;

public class PS3 implements ISaveable {

    private String name;
    private int numberofPlayers = 4;
    private int resolution;
    private String mediaType;


    public PS3(String name, int numberofPlayers, int resolution, String mediaType) {
        this.name = name;
        this.numberofPlayers = numberofPlayers;
        this.resolution = resolution;
        this.mediaType = mediaType;
    }

    Ps3Controller contollerOne = new Ps3Controller();
    Ps3Controller contollerTwo = new Ps3Controller();
    Ps3Controller contollerThree = new Ps3Controller();
    Ps3Controller contollerFour = new Ps3Controller();

    public String getName() {
        return name;
    }

    public int getNumberofPlayers() {
        return numberofPlayers;
    }

    public int getResolution() {
        return resolution;
    }

    public String getMediaType() {
        return mediaType;
    }

    @Override
    public void powerOn(boolean power) {
        boolean redLight;
        boolean blueLight;
        if (power) {
            blueLight = true;
            redLight = false;
            System.out.println("System is turning on");
            videoOuput(1080, 1920);
            startUpSequence(true);
        } else {
            blueLight = false;
            blueLight = true;
            System.out.println("System is turning off");
        }

    }

    @Override
    public void insertMedia(Game game) {
        playGame(game);
    }

    @Override
    public void startUpSequence(boolean startUpSequence) {
        startUpSequence = true;
        System.out.println("Playing PS3 start up");
    }


    @Override
    public void videoOuput(int x, int y) {
        System.out.println("Video is displaying at 1080p");
    }


    private void playGame(Game game) {
        if (game.getSystem().equals("PS3")) {
            System.out.println("Playing: " + game.getName());
        } else {
            System.out.println("This game is a " + game.getSystem() + " game and will not run.");
        }

    }

    @Override
    public String toString() {
        return "System Name: " + name +
                ", Max Number of Players: " + numberofPlayers +
                ", Resolution: " + resolution +
                ", Media Type: " + mediaType;
    }


}

