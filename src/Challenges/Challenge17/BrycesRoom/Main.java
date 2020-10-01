package Challenges.Challenge17.BrycesRoom;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        Couch couch = new Couch("Fabric", 2, "blue");
        Door door = new Door(40, 80);
        FishTank fishTank = new FishTank(true, 36, 6);
        Television tv = new Television("LG", 55, "4k");
        VideoGameConsole PS4 = new VideoGameConsole("PS4", 2);

        Room LivingRoom = new Room("Living Room", 12, 8, couch, door, fishTank, tv, PS4);

        LivingRoom.door.walkIn();
        enter.nextLine();
        LivingRoom.turnLightsOn();
        enter.nextLine();
        LivingRoom.fishTank.feedFish();
        enter.nextLine();
        LivingRoom.couch.getComfortable();
        enter.nextLine();
        LivingRoom.television.turnOn();
        enter.nextLine();
        LivingRoom.television.changeChannel();
        LivingRoom.television.changeInput();
        LivingRoom.videoGameConsole.turnOn();
        enter.nextLine();
        LivingRoom.videoGameConsole.loadGame("Uncharted");
        enter.nextLine();
        LivingRoom.videoGameConsole.finishPlaying();
        enter.nextLine();
        LivingRoom.couch.getoffCouch();
        enter.nextLine();
        LivingRoom.turnLightsOff();
        enter.nextLine();
        LivingRoom.door.walkOut();
        enter.nextLine();


    }
}
