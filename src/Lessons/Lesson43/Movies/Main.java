package Lessons.Lesson43.Movies;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> movieMap = new HashMap<>();

        movieMap.put("Star Wars", "An American epic space-opera media franchise created by George Lucas");
        movieMap.put("Jaws", "When a killer shark unleashes chaos on a beach community, it's up to a local sheriff, a marine biologist, and an old seafarer to hunt the beast down");
        movieMap.put("Lord of the Rings", "The Lord of the Rings is the saga of a group of sometimes reluctant heroes who set forth to save their world from consummate evil");
        movieMap.put("The Avengers", "Marvel's The Avengers or simply The Avengers, is a 2012 American superhero film based on the Marvel Comics superhero team of the same name.");

        System.out.println(movieMap.get("Star Wars"));
        System.out.println(movieMap.get("Jaws"));

        movieMap.put("Star Wars", "A series of science fiction films made by George Lucas and later Disney");

        System.out.println(movieMap.get("Star Wars"));

        if (movieMap.containsKey("Star Wars")) {
            System.out.println("There is already a key for Star Wars");
        } else {
            System.out.println("Star Wars is the best!");
        }

        for (String keys : movieMap.keySet()) {
            System.out.println(keys + ": " + movieMap.get(keys));
        }

        for (String key: movieMap.keySet()) {
            System.out.println(movieMap.get(key));
        }
    }

}