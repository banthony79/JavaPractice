//Create a function that finds the maximum range of a triangles third edge.


package JavaChallenges;


public class ThirdSide {

    public static void MaxThirdSide(int side1, int side2) {

        int maxThirdSide = (side1 + side2) - 1;
        System.out.println("The maximum third side of your triangle is " + maxThirdSide);
    }

    public static void main(String[] args) {
        MaxThirdSide(15, 12);
    }

}