package Challenges.Challenge17.BrycesRoom;


import java.util.concurrent.TimeUnit;

public class VideoGameConsole {

    public VideoGameConsole(String type, int howManyControllers) {
        this.type = type;
        this.connectionToTv = "HDMI";
        this.howManyControllers = howManyControllers;
        this.isOn = false;
    }

    private String type;
    private String connectionToTv;
    private int howManyControllers;
    private boolean isOn;


    public void turnOn() {
        this.isOn = true;
        System.out.println("Console is on");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Console is off");
    }


    public void loadGame(String game) {
        if (isOn) {
            try {
                Thread.sleep(3000);
                System.out.println(game + " is loaded");
            } catch (InterruptedException e) {
                System.out.println("Got interrupted");
            }
        } else {
            System.out.println("Please turn console on");
        }

    }

    public void finishPlaying() {
        turnOff();
    }
}

