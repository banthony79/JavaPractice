package CodingExercises.CodingExercise39;

public class Cuboid extends Rectangle {

    double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
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
