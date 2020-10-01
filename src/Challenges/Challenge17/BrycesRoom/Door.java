package Challenges.Challenge17.BrycesRoom;

public class Door {

    public Door(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int width;
    private int height;

    public void openDoor() {
        boolean isOpen = true;
        System.out.println("The door is open");
    }

    public void closeDoor() {
        boolean isOpen = false;
        System.out.println("The door is shut");
    }

    public void walkIn() {
        openDoor();
        System.out.println("You walk into the room");
        closeDoor();
    }

    public void walkOut() {
        closeDoor();
        System.out.println("You have left the room");

    }


}
