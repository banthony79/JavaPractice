package ComIT.ComIT6;

public class Rectangle {

    String name;
    double width;
    double length;
    double height;

    public Rectangle(String name, double width, double length, double height) {

        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Rectangle(String name, double width, double length) {

        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double printArea() {
        double area = width * length;
        return area;
    }

    public double printPerimeter() {
        double perimeter = width + length + height;
        return perimeter;
    }

    public double printVolume() {
        double volume = length * width * height;
        return volume;
    }


}

