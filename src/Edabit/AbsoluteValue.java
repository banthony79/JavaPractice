package Edabit;

public class AbsoluteValue {


        public static double absolute(double n) {
            double newNum = 0;
            if (n > 0) {
                newNum = n;
            } else {
                newNum =  n * -1;
            }
            return newNum; 	}

        public static void main(String args[]) {

            System.out.println(absolute(-5));
            System.out.println(absolute(-3.14));
            System.out.println(absolute(250));

        }
    }

//The Math.abs() function returns the absolute value of a number. This means that it returns a number's positive value. You can think of it as the distance away from zero.

//Create a function that recreates this functionality.


