package June22;

import java.util.Scanner;

public class CanadianDollar {

    public static void main(String[] args) {

        System.out.println("Please enter the amount you would like to convert from CAD to US");
        Scanner sc = new Scanner(System.in);
        int cad = sc.nextInt();
        int a = cad * 100/75;
        System.out.println("You have $" + a + " in American currency.");

    }

}

