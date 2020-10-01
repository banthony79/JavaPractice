package Challenges.Challenge17.BrycesRoom;

public class Room {

    public Room(String name, int width, int length, Couch couch, Door door, FishTank fishTank, Television television, VideoGameConsole videoGameConsole) {
        this.width = width;
        this.length = length;
        this.name = name;
        this.couch = couch;
        this.door = door;
        this.fishTank = fishTank;
        this.television = television;
        this.videoGameConsole = videoGameConsole;
    }


    int length;
    int width;
    String name;
    Couch couch;
    Door door;
    FishTank fishTank;
    Television television;
    VideoGameConsole videoGameConsole;


    public void turnLightsOn() {
        boolean lightsOn = true;
        System.out.println("The lights are on");
    }

    public void turnLightsOff() {
        System.out.println("The lights are off");
        boolean lightsOn = false;
    }

}
