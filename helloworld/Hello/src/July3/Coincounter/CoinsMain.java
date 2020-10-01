package July3.Coincounter;

import java.util.Scanner;

public class CoinsMain {

        public static void main(String[] args) {
            final Coins nickle = new Coins("nickle", 5);
            final Coins dime = new Coins("dime", 10);
            final Coins quarter = new Coins("quarter", 25);
            final Coins loonie = new Coins("loonie", 100);
            final Coins twoonie = new Coins("twoonie", 200);

            System.out.println("Please enter a cent value");
            Scanner in = new Scanner(System.in);
            int value = in.nextInt();

            Coins[] coins = {twoonie, loonie, quarter, dime, nickle};
            int [] values = new int[5];
            int tempValue = value;
            for (int i = 0; i < coins.length; i++) {
                Coins coin = coins[i];
                values[i] = coin.coinsNeeded(tempValue);
                if (values[i] > 0) {
                    tempValue = coin.totalAfterValue(tempValue);
                }
            }
            System.out.println("hello");
        }
    }

