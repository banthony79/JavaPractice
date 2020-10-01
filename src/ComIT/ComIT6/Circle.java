package ComIT.ComIT6;

import java.util.Scanner;

public class Circle {

    private String name;
    private double radius;
    private double height;


    public Circle() {

        Scanner nameInput = new Scanner(System.in);
        Scanner radiusInput = new Scanner(System.in);
        Scanner heightInput = new Scanner(System.in);
        System.out.println("Please input name");
        this.name = nameInput.next();
        System.out.println("Please input radius:");
        this.radius = radiusInput.nextDouble();
        System.out.println("Please input height:");
        this.height = heightInput.nextDouble();
    }

    public Circle(String name, double radius, double height) {
        this.name = name;
        this.radius = radius;
        this.height = height;

    }

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return this.name;
    }

    public double printArea() {
        double area = (Math.PI * Math.pow(radius, 2));
        return area;
    }

    public double printCircumference() {
        double circumference = (2 * Math.PI * radius);
        return circumference;
    }

    public double printVolume() {
        double volume = (4 / 3 * Math.PI * Math.pow(radius, 3));
        return volume;
    }


}





