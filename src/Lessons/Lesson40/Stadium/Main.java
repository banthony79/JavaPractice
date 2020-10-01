package Lessons.Lesson40.Stadium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Stadium stadium = new Stadium("Looyenga Stadium", 5, 10, 10);

        //stadium.showSeats();

        stadium.reserveSeat('A', 2, 5, 1);

        stadium.reserveSeat('B', 1, 2, 4);

        stadium.reserveSeat('C', 1, 2, 2);

        System.out.println(stadium.getPrice('C', 1, 5));

        List<Stadium.Seat> priceSeats = new ArrayList<>(stadium.getSeatList());

        Collections.sort(priceSeats, Stadium.PRICE_DISPLAY);

        printlist(priceSeats);


    }


    public static void printlist(List<Stadium.Seat> stadiumList) {
        for (Stadium.Seat seat : stadiumList) {
            System.out.println(seat.toString() + " - " + seat.getPrice());
        }
        System.out.println();
        System.out.println("================");
    }
}
