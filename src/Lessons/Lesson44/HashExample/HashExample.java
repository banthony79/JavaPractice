package Lessons.Lesson44.HashExample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HashExample {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        HashSet<Integer> numberHashMap = new HashSet();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
           int y =  rand.nextInt(50);
           numberHashMap.add(y);

        }

        Iterator it = numberHashMap.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        int number = numberHashMap.hashCode();

        System.out.println(number);

        Object o = new Object();
        Object p = new Object();

        System.out.println(o.hashCode());
        System.out.println(p.hashCode());

    }

}
