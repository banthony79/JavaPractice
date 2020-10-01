package PersonalStuff;

import java.util.ArrayList;

public class BackwardsString {

    public static char [] turnWordIntoArray(String word) {

        char [] charArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(i);
            //System.out.println(charArray[i]);
        }
    return charArray;
    }

    public static ArrayList<String> reverseArray() {
        String letter = "";
        char [] wordArray = turnWordIntoArray("bryce");
        ArrayList<String> newArray = new ArrayList<>();

        for (int i = 0; i < wordArray.length; i++) {
         letter = String.valueOf(wordArray[i]);
         newArray.add(((wordArray.length - 1) - i), letter);
            System.out.println(newArray.get(i));
        }
   return newArray;
    }




    public static void main(String[] args) {

        reverseArray();
    }

}
