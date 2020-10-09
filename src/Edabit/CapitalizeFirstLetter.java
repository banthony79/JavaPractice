package Edabit;

public class CapitalizeFirstLetter {


//Create a method that takes an array of names and returns an array where //only the first letter of each name is capitalized.  

            public static String[] capMe(String[] s) {
            String newName = "";
            String [] newArray = new String [s.length];
            for (int i = 0; i < s.length; i++) {
		 newName = capitalizeFirstLetter(s[i]);
		 newArray[i] = newName;
            }
            return newArray;
        }

        public static String capitalizeFirstLetter(String word) {
         String lowerCase = word.toLowerCase();
        char firstLetter = lowerCase.charAt(0);
        String firstLetterString = String.valueOf(firstLetter).toUpperCase();
        lowerCase = firstLetterString + lowerCase.substring(1);
        return lowerCase;  }

    }

