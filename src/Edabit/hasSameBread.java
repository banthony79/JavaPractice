package Edabit;
import java.util.Scanner;

public class hasSameBread {




        public static boolean hasSameBread(String[] a, String[] b) {
            String firstPiece = a[0];
            String secondPiece = a[2];
            String firstPiece2 = b[0];
            String secondPiece2 = b[2];

            if (firstPiece.equals(firstPiece2) && (secondPiece.equals(secondPiece2))) {
                return true;
            }
            return false; }



    }

/*Given two arrays, which represent two sandwiches, return whether both sandwiches use the same type of bread. The bread will always be found at the start and end of the array.

hasSameBread(
  ["white bread", "lettuce", "white bread"],
  ["white bread", "tomato", "white bread"]
) ➞ true

hasSameBread(
  ["brown bread", "chicken", "brown bread"],
  ["white bread", "chicken", "white bread"]
) ➞ false

hasSameBread(
  ["toast", "cheese", "toast"],
  ["brown bread", "cheese", "toast"]
) ➞ false
*/
