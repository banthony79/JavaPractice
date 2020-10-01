package Challenges.Challenge27.BrycesSolution;

public class Nintendo implements ISaveable {

    private String name;
    private int numberofPlayers;
    private int resolution;
    private String mediaType;

    public Nintendo(String name, int numberofPlayers, int resolution, String mediaType) {
        this.name = name;
        this.numberofPlayers = numberofPlayers;
        this.resolution = resolution;
        this.mediaType = mediaType;
    }

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

    NintendoController nintendoControllerOne = new NintendoController();
    NintendoController nintendoControllerTwo = new NintendoController();

    @Override
    public void powerOn(boolean power) {
        if (power) {
            boolean redLight = true;
            System.out.println("System is turning on");
            videoOuput(240, 256);
            startUpSequence(true);
        } else {
            boolean redLight = false;
            System.out.println("System is turning off");
        }

    }

    @Override
    public void insertMedia(Game game) {
        playGame(game);
    }

    @Override
    public void startUpSequence(boolean startUpSequence) {
        startUpSequence = false;

    }

    @Override
    public void videoOuput(int x, int y) {
        System.out.println("Video displaying at " + (x * y) + " pixels");

    }

    private void playGame(Game game) {
        if (game.getSystem().equals("Nintendo")) {
            System.out.println("Playing: " + game.getName());
        } else {
            System.out.println("This game is a " + game.getSystem() + " game and will not run.");
        }
    }

    @Override
    public String toString() {
        return "System Name: " + name +
                ", Max Number of Players: " + numberofPlayers +
                ", Resolution: " + resolution + " pixels" +
                ", Media Type: " + mediaType;
    }
}
