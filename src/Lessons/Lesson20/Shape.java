package Lessons.Lesson20;

public class Shape {

    private int x;
    private int y;


    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class RectangleOne extends Shape {

    private int width;
    private int height;

    public RectangleOne(int x, int y) {
        this(x, y, 0, 0); //calls second constructor
    }

    public RectangleOne(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}





