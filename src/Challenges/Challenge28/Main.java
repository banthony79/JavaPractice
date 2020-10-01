package Challenges.Challenge28;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Dookie", "Green Day");
        album.addSong("Burnout", 4.6);
        album.addSong("Having a Blast", 5.2);
        album.addSong("Chump", 2.3);
        album.addSong("Longview", 3.0);
        album.addSong("Burnout", 4.6);
        album.addSong("Welcome to Paradise", 3.5);
        album.addSong("Pulling Teeth", 2.38);
        album.addSong("She", 3.14);
        album.addSong("Sassasafras Roots", 3.0);
        albums.add(album);

        album = new Album("Smash", "The Offpsing");
        album.addSong("Nitro", 2.23);
        album.addSong("Bad Habit", 4.12);
        album.addSong("Gotta Get Away", 4.0);
        album.addSong("Genocide", 3.47);
        album.addSong("Something to Believe", 3.10);
        album.addSong("Come out and Play", 2.47);
        album.addSong("Self Esteem", 3.10);
        album.addSong("It'll be a Long Time", 2.15);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();


        play(playList);


    }


    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: ----> " + listIterator.next().toString());
        }
        printMenu();
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1: //going forward
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2: //going backward
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at #1");
                    }

                    break;
                case 3: //replaying song
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("You have reached the end.");
                        }

                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());

                        }
                    }

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available Actions");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - replay current song");
        System.out.println("4 - list songs in playlist");
        System.out.println("5 - print options again");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("===========================");
    }

}
