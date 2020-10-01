package CodingExercises.CodingExercise26;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = bigCount * 5 + smallCount;

        int remainder = goal % 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {

            return false;
        }

        if (sum < goal) return false;
        else {
            if (remainder <= smallCount) return true;
            else return false;

        }

    }
}
