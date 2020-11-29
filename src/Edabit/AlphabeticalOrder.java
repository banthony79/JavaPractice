package Edabit;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AlphabeticalOrder {



        public static String AlphabetSoup(String s) {


            int x = s.length();
            int [] array = alphabetical(s.toLowerCase());
            Arrays.sort(array);
            char [] newWord = new char[x];
            for (int i = 0; i < x; i++) {
                newWord[i] = letterFromNumber(array[i]);
            }

            String iDidIt = makeArrayIntoWord(newWord);
            return iDidIt;

        }

        public static void main(String args[]) {

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Please enter word");
                String input = scanner.nextLine();
                if (input.equals("quit")) {
                    break;
                }

                System.out.println("Your word in alphabetical order is: " +  AlphabetSoup(input));

            }


        }



        public static int letterPosition(char letter) {

            char alphabet [] = "abcdefghijklmnopqrstuvwxyz".toCharArray();

            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i]==letter) {
                    return i;
                }
            }
            return -1;  }


        public static int [] alphabetical(String word) {
            int j = 0;
            int [] array = new int[word.length()];
            for (int i = 0; i < word.length(); i++) {
                j = letterPosition(word.charAt(i));

                array[i] = j;

            }

            return array; }


        public static char letterFromNumber(int number) {
            char alphabet [] = "abcdefghijklmnopqrstuvwxyz".toCharArray();

            return alphabet[number]; }




        public static String makeArrayIntoWord(char [] charArray) {
            String newWord = "";     String letter = "";
            for (int i = 0; i < charArray.length; i++) {
                letter = String.valueOf(charArray[i]);
                newWord+=letter;
            }
            return newWord; }


    }


/*Create a method that takes a string and returns a string with its letters in alphabetical order.

Examples
AlphabetSoup("hello") ➞ "ehllo"

AlphabetSoup("edabit") ➞ "abdeit"

AlphabetSoup("hacker") ➞ "acehkr"

AlphabetSoup("geek") ➞ "eegk"

AlphabetSoup("javascript") ➞ "aacijprstv" */

