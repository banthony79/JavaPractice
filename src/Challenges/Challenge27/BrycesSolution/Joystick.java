package Challenges.Challenge27.BrycesSolution;


public class Joystick {

    public Joystick(String name) {
        this.name = name;
    }

    public void moveJoystick(int degreeOfArticulation) {
        System.out.println(name + " moves " + degreeOfArticulation + " degrees");
    }

    private String name;
}
