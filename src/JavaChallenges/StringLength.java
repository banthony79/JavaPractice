package JavaChallenges;


public class StringLength {

    public static int Length(String s1) {
        int stringlength = s1.length();
        System.out.println(stringlength);
        return stringlength;

    }


    public static void main(String[] args) {
        Length("Bryce");
        Length("superkalafragilisticexpialadosous");

    }
}