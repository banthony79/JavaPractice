package July5;

import java.util.Scanner;


public class Discount {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter total");
        double gross = in.nextInt();
        if (gross <= 1000) {
            double disc = gross * .30;
            double total = gross - disc;
            System.out.println("Your discount is $" + disc + " and your total is $" + total);
        }
        else if (gross > 1000);
        double disc = gross * .35;
        double total = gross - disc;
        System.out.println("Your discount is $"+ disc + " and your total is $" + total);



    }

}
