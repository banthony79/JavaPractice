package Challenges.Challenge17.BrycesRoom;

import java.util.Scanner;

public class Television {

    public Television(String model, int size, String resolution) {
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("TV is on");
    }


    public void turnOff() {
        this.isOn = false;
        System.out.println("TV is off");
    }

    public void changeChannel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the channel you would like to switch to");
        boolean isAnInt = sc.hasNextInt();
        if (isAnInt) {
            int channel = sc.nextInt();
            System.out.println("You have changed the channel to channel number " + channel);
        } else {
            System.out.println("Invalid number");
        }
    }

    public void changeInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which input would you like 1) Video Games 2) Cable");
        int tvInput = input.nextInt();
        while (true) {
            if (tvInput < 0 || tvInput > 3) {
                System.out.println("Invalid input");
                System.out.println("Which input would you like 1) Video Games 2) Cable");
                tvInput = input.nextInt();
            } else {
                System.out.println("Input changed to " + tvInput);
                break;
            }
        }


    }


    public void finishWatching() {
        turnOff();
    }

    public void watchMovie(String movie) {
        System.out.println("You are watching " + movie);
    }


    String model;
    int size;
    String resolution;
    boolean isOn;
}
