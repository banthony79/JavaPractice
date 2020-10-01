package Challenges.Challenge17.BrycesRoom;

public class Couch {

    public Couch(String material, int pillows, String colour) {
        this.material = material;
        this.pillows = pillows;
        this.colour = colour;
    }

    String material;
    int pillows;
    String colour;


    public void sitDown() {
        System.out.println("You have sat on the couch");
    }

    public void putFeetUp() {
        System.out.println("You have put feet up on the coffee table");
    }

    public void getComfortable() {
        sitDown();
        putFeetUp();
    }

    public void getoffCouch() {
        System.out.println("You get off the couch");
    }
}
