package JavaChallenges;

//Create a function that reverses a boolean value.


public class BooleanFlip {

    public static boolean Fliptheboolean(boolean Flip) {
        if (Flip == true) {
            System.out.println("false");
            return false;
        }

        if (Flip == false) {
            System.out.println("true");
            return true;
        }

        return Flip;

    }

    public static void main(String[] args) {

        Fliptheboolean(true);
        Fliptheboolean(false);

    }

}

 