package CodingExercises.CodingExercise37;

public class Cylinder extends Circle {

    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }
}
