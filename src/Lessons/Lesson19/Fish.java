package Lessons.Lesson19;

public class Fish extends Lessons.Lesson19.Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public Fish(int gills, int eyes, int fins) {
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {

    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(15);
    }

    private void moveMuscles() {


    }

    private void moveBackFin() {

    }

}
