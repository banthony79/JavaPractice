package Challenges.Challenge10;

public class EvenNumber {

    public static boolean isEvenNumber(int num1) {
        if (num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //dowhile loop - do

    public static void main(String[] args) {
        int num1 = 4;
        int finishNumber = 20;
        int count = 0;

        while (num1 <= finishNumber) {
            num1++;
            if (isEvenNumber(num1)) {
                System.out.println("Even Number " + num1);
                count++;
                if (count == 5) {
                    break;
                }
            }
            continue;
        }
        System.out.println("Total even numbers found " + count);
    }

}

