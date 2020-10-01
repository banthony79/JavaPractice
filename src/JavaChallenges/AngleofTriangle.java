package JavaChallenges;

//Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.

public class AngleofTriangle {


    public static String TriangleAngle(int angle) {
        if (angle > 90) return "acute";
        else if (angle == 90) return "right";
        else if (angle < 90) return "obtuse";
        else if (angle > 360) return "invalid value";
        else return "none";
    }


    public static void main(String[] args) {

        System.out.println(TriangleAngle(75));
        System.out.println(TriangleAngle(150));
        System.out.println(TriangleAngle(180));

    }

}