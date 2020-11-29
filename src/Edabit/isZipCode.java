package Edabit;

import java.util.Arrays;

public class isZipCode {



        public static boolean isValid(String zip) {

            if ((isNumber(zip)) && (checkSpaces(zip)) && (is5digits(zip))) {
                return true;
            }

            return false; 	}

        public static void main(String [] args) {
            System.out.println(isValid("54241"));
            System.out.println(isValid("6344 1"));
        }

        public static boolean isNumber(String input) {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    count++;
                }
            }


            if (count == 5) {
                return true;
            }
            return false; 	}


        public static boolean checkSpaces(String input) {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }

            if (count != 0) {
                return false;
            }
            return true; }


        public static boolean is5digits(String input) {
            if (input.length() == 5) {
                return true;
            }
            return false;

        }


    }







/*Zip codes consist of 5 consecutive digits. Given a string, write a function to determine whether the input is a valid zip code. A valid zip code is as follows:

Must only contain numbers (no non-digits allowed).
Must not contain any spaces.
Must not be greater than 5 digits in length.
Examples
isValid("59001") ➞ true

isValid("853a7") ➞ false

isValid("732 32") ➞ false

isValid("393939") ➞ false */

