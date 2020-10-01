package JavaChallenges;

public class PieSlices {

    public static boolean PieSlices(int totalSlices, int noOfPeople, int slicesEach) {
        int slicesPerPerson = slicesEach * noOfPeople;
        if (slicesPerPerson < totalSlices || slicesPerPerson == totalSlices) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }


    public static void main(String[] args) {
        PieSlices(11, 5, 2);
        PieSlices(11, 5, 3);
        PieSlices(8, 3, 2);
        PieSlices(8, 3, 3);
        PieSlices(24, 12, 2);
    }
}

