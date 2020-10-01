package Lessons.Lesson20;

public class Rectangle {

    private int x;
    private int y;
    private int height;
    private int width;

    public Rectangle() {
        this(0, 0);
        //calls second constructor
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, height);
        //calls 3rd constructor
    }

    public Rectangle(int x, int y, int width, int height) {
        //intialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
