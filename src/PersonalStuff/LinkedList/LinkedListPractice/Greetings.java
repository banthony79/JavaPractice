package PersonalStuff.LinkedList.LinkedListPractice;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Greetings {


    public static LinkedList<String> greetings = new LinkedList<String>();

    public static void sayingHi(LinkedList<String> linkedlist) {
        Iterator itr = linkedlist.listIterator();
        while (itr.hasNext()) {
            System.out.println("Hello " + itr.next());
        }
    }


    public static void main(String[] args) {


        greetings.add("Bounjor");
        greetings.add("Hola");
        greetings.add("Privet");
        greetings.add("Ni Hao");
        greetings.add("Salve");
        greetings.add("Gutentag");
        greetings.add("Ola");

        Iterator<String> i = greetings.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        integerArrayList.add(5);
        integerArrayList.add(673);
        integerArrayList.add(121);
        integerArrayList.add(777);
        integerArrayList.add(1791);
        integerArrayList.add(501);

        Iterator<Integer> q = integerArrayList.iterator();

        System.out.println("Integers Array List:");
        while (q.hasNext()) {
            System.out.println(q.next());
        }

        LinkedList<String> names = new LinkedList<String>();

        names.add("Ben");
        names.add("Luke");
        names.add("Leia");
        names.add("Anakin");
        names.add("Han");
        names.add("C3PO");
        names.add("Rey");
        names.add("Chewie");

        ListIterator<String> itr = names.listIterator();

        sayingHi(names);


    }


}

