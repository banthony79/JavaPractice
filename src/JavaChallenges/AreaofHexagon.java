package JavaChallenges;

import java.util.Scanner;

public class AreaofHexagon {

//Write a Java program to compute the area of a hexagon

    public static double HexagonArea(int side) {
        double area = (6 * (side * side)) * (Math.tan(4)) * (Math.PI / 6);
        System.out.println("The Hexagon Area is " + area);
        return side;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of side");
        int side = sc.nextInt();
        HexagonArea(side);

    }
}