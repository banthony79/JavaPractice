package Lessons.Lesson40.Stadium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stadium {

    private String stadiumName;
    public ArrayList<Seat> seatList;

    static final Comparator<Seat> PRICE_DISPLAY = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()) {
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };


    public Stadium(String stadiumName, int numberOfSections, int numberOfRows, int seatsPerRow) {
        this.stadiumName = stadiumName;
        this.seatList = new ArrayList<>();


        int seatNumber = 1;
        int lastSection = 'A' + (numberOfSections - 1);
        for (char section = 'A'; section <= lastSection; section++) {
            for (int row = 1; row <= numberOfRows; row++) {
                for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                    double price = 0;
                    Seat seat = new Seat(section, row, seatNum);
                    if (row >= 2 && row <= 5) {
                        seat.price = 16.75;
                    } else if (row == 1) {
                        seat.price = 24.50;
                    } else {
                        seat.price = 12.15;
                    }
                    seat.seatNumber = seatNumber++;
                    seatList.add(seat);


                }
            }

        }

    }


    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public double getPrice(char section, int row, int seat) {
        return seatList.get(returnSeatNumber(section, row, seat)).getPrice();
    }

    public void showSeats() {
        for (Seat seat : seatList) {
            System.out.println(seat.toString());

        }
        System.out.println("");
        System.out.println("Capacity: " + seatList.size());
    }

    public boolean reserveSeat(char section, int row, int seat, int partySize) {
        if (returnSeatNumber(section, row, seat) == -1) {
            System.out.println("This seat does not exist");
            return false;
        }
        Seat reservedSeat = seatList.get(returnSeatNumber(section, row, seat));
        double sum = 0;
        if (!reservedSeat.reserved()) {
            for (int i = 1; i <= partySize; i++) {
                sum = reservedSeat.price + sum;
                System.out.println(reservedSeat.toString() + " has been reserved, please pay " + sum);
                reservedSeat.reserved = true;
                reservedSeat = seatList.get(returnSeatNumber(section, row, seat) + i);
            }
        } else {
            System.out.println("This seat is already reserved");
            return false;
        }
        return true;
    }


    public int returnSeatNumber(char section, int row, int seat) {
        for (Seat reservedSeat : seatList) {
            if (reservedSeat.section == section
                    && reservedSeat.row == row && reservedSeat.seat == seat) {

                return reservedSeat.seatNumber - 1;
            }
        }
        return -1;
    }


    public class Seat implements Comparable<Seat> {

        private int seatNumber;
        private final char section;
        private final int row;
        private final int seat;
        private double price;
        private boolean reserved;

        public Seat(char section, int row, int seat) {
            this.section = section;
            this.row = row;
            this.seat = seat;
            this.price = price;


        }

        @Override
        public int compareTo(Seat seat) {
            return Integer.compare(this.seatNumber, seat.getSeatNumber());
        }

        @Override
        public String toString() {
            return "Seat Number: " + seatNumber + ", Section: " + section + ", Row: " + row + ", Seat: " + seat;
        }

        public char getSection() {
            return section;
        }

        public int getRow() {
            return row;
        }

        public int getSeat() {
            return seat;
        }

        public double getPrice() {
            return price;
        }

        public boolean isReserved() {
            return reserved;
        }

        public boolean reserved() {
            return reserved;
        }

        public int getSeatNumber() {
            return seatNumber;
        }
    }
}
