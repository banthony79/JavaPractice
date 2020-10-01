package Challenges.Challenge17.BrycesRoom;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;


public class FishTank {

    public FishTank(boolean isFreshwater, int sizeInGallons, int howManyFish) {
        this.isFreshwater = isFreshwater;
        this.sizeInGallons = sizeInGallons;
        this.howManyFish = howManyFish;
        this.hasHeater = true;
        this.hasFilter = true;
    }

    public void feedFish() {
        System.out.println("You have fed the fish");
    }

    public void light() {
        Calendar calendar = Calendar.getInstance();
        LocalTime start = LocalTime.parse("10:00:00");
        LocalTime stop = LocalTime.parse("21:00:00");
        LocalTime target = LocalTime.now();
        boolean isTargetAfterStartAndBeforeStop = (target.isAfter(start) && target.isBefore(stop));
        if (isTargetAfterStartAndBeforeStop) {
            System.out.println("The time is currently " + target + "and the light is currently on");
        } else {
            System.out.println("The time is currently " + target + "and the light is currently off");
        }


    }

    boolean isFreshwater;
    int sizeInGallons;
    int howManyFish;
    boolean hasHeater;
    boolean hasFilter;
}
