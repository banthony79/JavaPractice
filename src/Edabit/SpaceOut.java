package Edabit;

public class SpaceOut {



        public static String puttingSpaceAfter(char letter) {
         String letterWithSpace = (String.valueOf(letter) + " ");

         return letterWithSpace;

  }


        public static String spaceMeOut(String str) {
        String newWord = "";
        for (int i = 0; i < str.length(); i++) {
		 newWord+=puttingSpaceAfter(str.charAt(i));
		 		 }
        return gettingRidOfSpace(newWord);
    }

        public static String gettingRidOfSpace(String word) {
		 String str = word.substring(0, word.length()-1);

            return str;
        }

    }
