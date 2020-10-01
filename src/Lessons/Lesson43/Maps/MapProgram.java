package Lessons.Lesson43.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "A compiled high level language, object orientated, independant language");
            System.out.println("Java added successfully");
        }

        languages.put("Java", "A compiled high level language, object orientated, independant language");
        languages.put("Python", "A interpeted, object orientated, high level, programming language with dynamic semantics");
        languages.put("Algol", "An alogrithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        System.out.println(languages.put("Java", "This course is about Java"));

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println("Java, this course is about Java");
        }


        System.out.println("============================================");

        languages.remove("Lisp");
        if (languages.remove("Algol", "A family of alogrithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Key/value pair not found");
        }

        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        for (String keys : languages.keySet()) {
            System.out.println(keys + ": " + languages.get(keys));
        }
    }
}
