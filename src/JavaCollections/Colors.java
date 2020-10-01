package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Colors {

    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList colors = new ArrayList<>();

    public static void main(String[] args) {

        addColor();


    }

    public static void addColor() {
        boolean quit = false;
        System.out.println("Please type color name(type end to stop");
        while (!quit) {
            String color = scanner.nextLine();
            colors.add(color);
            if (color.equals("end")) {
                colors.remove(colors.size() - 1);
                printColor();
                quit = true;
            }
        }
    }

    public static void printColor() {
        Iterator i = colors.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
