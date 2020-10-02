package PersonalStuff.CoinFlip;

import java.util.ArrayList;
import java.util.Random;

public class Coin {

    public enum Sides {
        HEADS,
        TAILS,
    }

    private ArrayList<Sides> sides;


    public Coin() {
        this.sides = new ArrayList<>();
        sides.add(0, Sides.HEADS);
        sides.add(1, Sides.TAILS);
    }

    private static Random rand = new Random();


    public String flip() {
        String result = String.valueOf(sides.get(rand.nextInt(2)));
   return result;
    }





}
