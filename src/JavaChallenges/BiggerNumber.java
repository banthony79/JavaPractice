package JavaChallenges;

public class BiggerNumber {

    public static int WhatNumberisBigger(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is the bigger number.");
        } else {
            System.out.println(num2 + " is the bigger number.");
        }
        {
            return num1 + num2;
        }
    }


    public static void main(String[] args) {

        WhatNumberisBigger(34, 12);
        WhatNumberisBigger(12, 34);
        WhatNumberisBigger(1001, 900);

    }
}