package CodingExercises.CodingExercise27;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        int z = number;
        for (int i = number; i < 0; i++) {
            if (z % i == 0)
                System.out.println(i);
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        getLargestPrime(21);
    }

}