package Challenges.Challenge17.TimsRoom;

public class Lamp {

    private String style;
    private boolean battery;
    private int gloRating;

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGloRating() {
        return gloRating;
    }

    private void turnOn() {
        System.out.println("Lamp is on");
    }

    public Lamp(String style, boolean battery, int gloRating) {
        this.style = style;
        this.battery = battery;
        this.gloRating = gloRating;
    }
}
