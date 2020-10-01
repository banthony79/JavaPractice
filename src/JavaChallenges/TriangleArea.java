package JavaChallenges;

//Write a function that takes the base and height of a triangle and return its area.

public class TriangleArea {

    public static void AreaofTriangle(int base, int height) {
        int area = base * height;
        System.out.println("Your triangle has an area of " + base + " * " + height + " = " + area + ".");
    }

    public static void main(String[] args) {

        AreaofTriangle(5, 10);
        AreaofTriangle(10, 20);
        AreaofTriangle(15, 25);

    }

}