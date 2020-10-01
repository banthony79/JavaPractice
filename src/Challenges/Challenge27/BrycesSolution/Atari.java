
package Challenges.Challenge27.BrycesSolution;

public class Atari implements ISaveable {


    private String name;
    private int numberofPlayers;
    private int resolution;
    private String mediaType;

    AtariController atariController = new AtariController();

    public Atari(String name, int numberofPlayers, int resolution, String mediaType) {
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

    @Override
    public void powerOn(boolean power) {
        if (power) {
            startUpSequence(false);
            System.out.println(name + " is turned on");
            videoOuput(160, 192);
        } else {
            System.out.println(name + " is powering down");
        }

    }

    @Override
    public void insertMedia(Game game) {
        playGame(game);
    }


    @Override
    public void startUpSequence(boolean startUpSequence) {
        if (!startUpSequence) {
            System.out.println("No start up sequence");
        } else {
            System.out.println("Playing start up sequence");
        }
    }

    @Override
    public void videoOuput(int x, int y) {
        System.out.println("Displaying video at " + (x * y) + " pixel resolution");
    }


    private void playGame(Game game) {
        if (game.getSystem().equals("Atari")) {
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

