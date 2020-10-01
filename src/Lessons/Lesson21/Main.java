package Lessons.Lesson21;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 50);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 inch beast", "acer", 27, new Resolution(2540, 1440));
        Motherboard themotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "V.244");


        PC thePC = new PC(theCase, theMonitor, themotherboard);
        //thePC.getMonitor().drawPixelAt(1200, 1500, "red");
        //thePC.getMotherboard().loadProgram("Windows 1.90");
        //thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

    }
}
