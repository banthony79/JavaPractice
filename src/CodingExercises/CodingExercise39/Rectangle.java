package CodingExercises.CodingExercise39;

public class Rectangle {

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        if (length < 0) {
            this.length = 0;
        }
        if (width < 0) {
            this.width = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    private double length;
    private double width;

}