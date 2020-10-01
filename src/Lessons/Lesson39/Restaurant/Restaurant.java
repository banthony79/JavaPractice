package Lessons.Lesson39.Restaurant;

import Lessons.Lesson38.Password;

import java.util.ArrayList;
import java.util.Random;

public class Restaurant {

    private String restaurantName;
    private int numberofTables;
    private ArrayList<Table> tables;

    public Restaurant(String restaurantName, int numberofTables) {
        this.restaurantName = restaurantName;
        this.numberofTables = numberofTables;
        this.tables = new ArrayList<>();


        for (int i = 1; i < numberofTables + 1; i++) {

            Table table = new Table(i);
            tables.add(table);
            int lastTable = 'A' + (table.getNumberOfSeats() - 1);
            //for (int j = 0; j < tables.get(i).getNumberOfSeats(); j++) {
            for (char firstSeat = 'A'; firstSeat <= lastTable; firstSeat++) {
                Seat seat = new Seat(firstSeat);
                table.getSeats().add(seat);
            }

        }

    }

    public void reserveByTableNumber(int tableNumber) {
        if (reserveTable(tableNumber)) {
            System.out.println("Table " + tableNumber + " has been reserved for you");
        } else {
            System.out.println("Table is already reserved");
        }
    }

    private boolean reserveTable(int tableNumber) {
        tableNumber = tableNumber - 1;
        if (!tables.get(tableNumber).reserved) {
            tables.get(tableNumber).reserved = true;
            for (int i = 0; i < tables.get(tableNumber).getNumberOfSeats() - 1; i++) {
                tables.get(tableNumber).getSeats().get(i).reserved = true;
            }

            return true;
        }
        if (tables.get(tableNumber).reserved) {
            return false;
        }
        return false;
    }


    private int returnTablePostion(int numberOfPeople) {
        for (int i = 0; i <= tables.size(); i++) {
            // System.out.println(tables.get(i).getNumberOfSeats());
            if (numberOfPeople <= (tables.get(i).getNumberOfSeats()) && (!tables.get(i).reserved)) {
                return i;
            }
        }
        return -1;
    }


    public void reserveByTableSize(int partySize) {
        int position = returnTablePostion(partySize);
        if (position >= 0) {
            System.out.println("Table " + (position + 1) + " is reserved for you");

        } else {
            System.out.println("We do not have a table available.");
        }
    }


    public void getTables() {
        int sum = 0;
        for (int i = 0; i < tables.size(); i++) {
            System.out.println("Table #" + tables.get(i).getTableNumber() + " - " + tables.get(i).getNumberOfSeats());
            for (int j = 0; j < tables.get(i).getNumberOfSeats(); j++) {
                sum = sum + tables.get(i).getNumberOfSeats();
                System.out.println("Seat: " + tables.get(i).getSeats().get(j).getSeatLetter());
            }
        }
        System.out.println();
        System.out.println("Total number of seats: " + sum);
    }


    private class Table {

        Random rand = new Random();

        private int tableNumber;
        private boolean reserved;
        private int numberOfSeats;
        ArrayList<Seat> seats;

        public Table(int tableNumber) {
            this.tableNumber = tableNumber;
            this.reserved = reserved;
            this.numberOfSeats = rand.nextInt(5) + 1;
            this.seats = new ArrayList<>();

        }


        public int getTableNumber() {
            return tableNumber;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public ArrayList<Seat> getSeats() {
            return seats;
        }

        public boolean isReserved() {
            return reserved;
        }
    }


    private class Seat {

        private char seatLetter;
        private boolean reserved;

        public Seat(char seatLetter) {
            this.seatLetter = seatLetter;
            this.reserved = reserved;

        }

        public char getSeatLetter() {
            return seatLetter;
        }

        public void setSeatLetter(char seatLetter) {
            this.seatLetter = seatLetter;
        }
    }

}
