package PersonalStuff;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductionCalculator {

    public static ArrayList<Double> production = new ArrayList<>();
    public static int totalFeed = 0;



    public static double percentage(int percentage) {

        return ((percentage * .01) * totalFeed);

    }

    public static double sum(ArrayList<Double> num) {
        double sum = 0;
        for (Double number: num) {
            sum = sum + number;
        }
    return sum; }

    public static void productionEntry(double number, String productName) {
        System.out.println("Production for " + productName + " is " +(int) number + " tons.");
        if ((productName.equals("Washed loss") || (productName.equals("Oversize")))) {

        } else {
            production.add(number);
        }
    }
    

    public static void main(String [] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("East Pit Production Entry");

        System.out.println("Please enter starting meter");
        int start = scanner.nextInt();
        System.out.println("Please enter ending meter");
        int stop = scanner.nextInt();

        totalFeed = stop - start;

        productionEntry(percentage(50), "Washed sand");
        productionEntry(percentage(3), "Washed loss");
        productionEntry(percentage(3), "Oversize");
        productionEntry(percentage(10), "40 mm round");
        productionEntry(percentage(7), "20 mm round");
        productionEntry(percentage(14), "14 mm round");
        productionEntry(percentage(8), "10 mm round");
        productionEntry(percentage(5), "5 mm round");

        System.out.println();
        System.out.println("Total production is " + sum(production) + " tons.");


    }
}



