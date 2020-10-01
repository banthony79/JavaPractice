package Challenges.Challenge18;

import java.sql.SQLOutput;

public class Printer {

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = 100;
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void printPage(int pages) {
        int tonerPages = pages;
        if (isDuplex) {
            pages = pages / 2 + pages % 2;
        }
        this.pagesPrinted = this.pagesPrinted + pages;
        this.tonerLevel = tonerLevel - tonerPages;
        System.out.println("You have printed " + getPagesPrinted() + " pages and your toner level is at " + tonerLevel + "%");
        if (tonerLevel < 20) {
            System.out.println("You need to add toner.");
        }
    }


    public double getTonerLevel() {
        System.out.println("Your toner level is " + tonerLevel);
        return tonerLevel;
    }

    public int addToner(int tonerAmount) {
        int tonerNeeded = 100 - tonerLevel;
        if (tonerAmount > tonerNeeded) {
            System.out.println("You have added too much toner");
        } else {
            System.out.println("You have added " + tonerAmount + " parts of toner");
            this.tonerLevel = tonerLevel + tonerAmount;
            System.out.println("Toner level is now at " + tonerLevel);


        }
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    private int tonerLevel;
    private int pagesPrinted;
    boolean isDuplex;
}
