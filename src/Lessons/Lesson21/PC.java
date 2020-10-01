package Lessons.Lesson21;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //draw fancy graphics
        getMonitor().drawPixelAt(1200, 50, "yellow");
    }


    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

}
