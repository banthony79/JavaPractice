package Challenges.Challenge17.TimsRoom;

public class Main {

    public static void main(String[] args) {


        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("east");
        Ceiling ceiling = new Ceiling(12, "white");
        Bed bed = new Bed("modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("classic", true, 75);
        Bedroom bedroom = new Bedroom("Bryces room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();

    }
}
