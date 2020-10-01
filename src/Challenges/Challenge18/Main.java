package Challenges.Challenge18;

public class Main {
    public static void main(String[] args) {


        Printer printer = new Printer(50, true);
        System.out.println("The current pages printed is at " + printer.getPagesPrinted());
        printer.printPage(4);
        printer.printPage(2);
        System.out.println("The current pages printed is at " + printer.getPagesPrinted());


    }
}
