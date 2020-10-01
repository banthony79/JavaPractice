package June22;

import java.util.Random;

public class PostiveorNegative {


        public static void main(String[] args) {
            Random rand = new Random();
            int randomNumber = (rand.nextInt(100) - 200);
            System.out.println("The number is " + randomNumber);
            if (randomNumber < 0) {
                System.out.println("The number is less than 0");
            } else if
            (randomNumber > 0)
                System.out.println("The number is more than 0");


        }
    }

