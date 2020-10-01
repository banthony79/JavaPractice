package HackerRank;


import java.io.*;
import java.util.*;


public class StringIntro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) <= 0) {
            System.out.println("No");

        } else {
            System.out.println("Yes");
        }

        System.out.println(Character.toString(A.charAt(0)).toUpperCase() + A.substring(1) + " "
                + Character.toString(B.charAt(0)).toUpperCase() + B.substring(1));


    }

}
 

