package Edabit;

import java.util.Arrays;
import java.util.Collections;




public class SocietyName {


    public static String societyName(String[] friends) {

        String newWord = "";
        for (int i = 0; i < friends.length; i++) {
            newWord+=firstLetter(friends[i]);
        }

        int [] numArray = alphabetical(newWord.toLowerCase());
        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));
        String answer = "";
        for (int i = 0; i < numArray.length; i++) {
            answer+=letterFromNumber(numArray[i]);
        }

        return answer.toUpperCase(); 	}

    public static void main(String args[]) {



        System.out.println(societyName(new String [] {"Adam", "Sarah", "Malcolm"}));

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


    public static String letterFromNumber(int number) {
        char alphabet [] = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        return String.valueOf(alphabet[number]); }




    public static String firstLetter(String word) {
        return String.valueOf(word.charAt(0));
    }


}


 /* A group of friends have decided to start a secret society. The name will be the first letter of each of their names, sorted in alphabetical order.

Create a function that takes in an array of names and returns the name of the secret society.

Examples
societyName(["Adam", "Sarah", "Malcolm"]) ➞ "AMS"

societyName(["Harry", "Newt", "Luna", "Cho"]) ➞ "CHLN"

societyName(["Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"]) ➞ "CJMP
 */