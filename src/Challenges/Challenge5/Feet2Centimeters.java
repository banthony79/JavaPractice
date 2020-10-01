package Challenges.Challenge5;

public class Feet2Centimeters {

    public static double calcFeetandInchesToCentimters(double feet, double inches) {
        double centimeters = ((feet * 12) + inches) * 2.54;
        if (feet <= 0 || inches <= 0 || inches >= 12) {
            System.out.println("Invalid Entry");
            return -1;
        } else {
            System.out.println(centimeters + " cms");
            return centimeters;
        }

    }

    public static double calcFeetandInchesToCentimters(double inches) {
        if (inches <= 0) {
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remaininginches = (int) inches % 12;
            System.out.println(feet + "," + inches);
            return calcFeetandInchesToCentimters(feet, remaininginches);
        }
    }

    public static void main(String[] args) {
        calcFeetandInchesToCentimters(100);
    }

}

