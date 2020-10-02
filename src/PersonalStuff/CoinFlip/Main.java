package PersonalStuff.CoinFlip;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Coin coin = new Coin();

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Pick a side");

            String choice = scanner.nextLine();

            if(choice.isEmpty()) {
                break;
            }

            choice = choice.toUpperCase();
            String flipResult = coin.flip().toUpperCase();


            if ((!choice.equals("HEADS")) && (!choice.equals("TAILS"))) {
                System.out.println("Invalid response");
            } else if (choice.equals(flipResult)) {
                System.out.println("It was: " + flipResult);
                System.out.println("You win!");
            } else {
                System.out.println("It was: " + flipResult);
                System.out.println("You lose :(");
            }


        }


    }



    public static void flipCoinManyTimes(int number, Coin coin) {
        int headCount = 0; int tailCount = 0;
        for (int i = 0; i < number; i++) {
            String result =  coin.flip();
            if (result.equals("HEADS")) {
                headCount++;
            } else {
                tailCount++;
            }
        }

        System.out.println("HEAD COUNT " + headCount);
        System.out.println("TAIL COUNT " + tailCount);
    }

    }



