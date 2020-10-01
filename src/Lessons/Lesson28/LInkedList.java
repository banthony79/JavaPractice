package Lessons.Lesson28;


import java.util.*;

public class LInkedList {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        System.out.println("In order");
        addInOrder("Saskatoon", placesToVisit);
        addInOrder("Montreal", placesToVisit);
        addInOrder("Ottawa", placesToVisit);
        addInOrder("Winnipeg", placesToVisit);
        addInOrder("Canora", placesToVisit);
        addInOrder("Vancouver", placesToVisit);
        addInOrder("Halifax", placesToVisit);
        addInOrder("Calgary", placesToVisit);
        addInOrder("Edmonton", placesToVisit);

        addInOrder("Saskatoon", placesToVisit);

        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedlist) {
        ListIterator<String> stringListIterator = linkedlist.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); //have to use
            //to go to the first record (.next)
            if (comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //newCity should appear before this one
                //Calgary < Edmonton
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {
                if (comparison < 0) {
                    //move onto next city
                }
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============");

    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in itinerary");
            return;
        } else {
            System.out.println("Now visitng " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation Over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }


        }
    }

    private static void printMenu() {

        System.out.println("Available options");
        System.out.println("0. Quit");
        System.out.println("1. Go to Next City");
        System.out.println("2. Go to Previous City");
        System.out.println("3. Print Menu Options");
    }
}
