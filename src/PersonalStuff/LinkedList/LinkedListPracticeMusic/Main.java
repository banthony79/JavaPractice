package PersonalStuff.LinkedList.LinkedListPracticeMusic;

import Lessons.Lesson28.LInkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static LinkedList<String> Songs = new LinkedList<String>();


    public static void main(String[] args) {

        addSong("Hey Jude");
        addSong("A Day in the Life");
        addSong("Let it Be");
        addSong("Here Comes the Sun");
        addSong("Yesterday");
        addSong("Strawberry Fields Forever");
        addSong("While My Guitar Gently Weeps");

        listSongs(Songs);
        play(Songs);


    }


    public static void addSong(String addSong) {
        Songs.add(addSong);
    }


    public static void nowListening(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) { //hasNext means is there a entry after this one?
            System.out.println("Now listening ----> " + i.next());
        }
    }

    public static void listSongs(LinkedList<String> linkedList) {

        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) { //hasNext means is there a entry after this one?
            for (int i = 0; i < linkedList.size(); i++) {
                System.out.println((i + 1) + "." + itr.next());
            }
            System.out.println("==============");
        }
    }

    public static void play(LinkedList<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator();

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        System.out.println("1 to go forward and 2 to go backward");
        while (!quit) {
            int selection = scanner.nextInt();
            switch (selection) {
                case 1: //go forward
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing -------> " + listIterator.next());
                    } else {
                        System.out.println("You have reached the end");
                    }

                    break;

                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing -------> " + listIterator.previous());

                    } else {
                        System.out.println("You are at the beginning");
                    }
                    break;
                case 3:
                    quit = true;
                    break;


            }


        }
    }
}



