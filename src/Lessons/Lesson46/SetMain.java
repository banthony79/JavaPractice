package Lessons.Lesson46;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);

        }
        System.out.println("There are " + squares.size() + " squares.");
        System.out.println("There are " + cubes.size() + " cubes.");

        Set <Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square root of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words  = new HashSet<>();
        String sentence = "One day in the year of the fox.";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s: words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> devine = new HashSet<>();

        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};

        nature.addAll(Arrays.asList(natureWords));
        String[] devineWords = {"to", "err", "is", "human", "to", "forgive", "devine"};
        devine.addAll(Arrays.asList(devineWords));


        System.out.println("nature - devine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(devine);
        printSet(diff1);

        System.out.println("devine - nature");
        Set<String> diff2 = new HashSet<>(devine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(devine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(devine);

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);



    }


    private static void printSet(Set<String> objects) {
        System.out.println("\t");
        for(String s: objects) {
            System.out.print(s + " ");
        }

        System.out.println();
    }
}
