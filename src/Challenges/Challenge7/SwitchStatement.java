package Challenges.Challenge7;

public class SwitchStatement {

    public static void main(String[] args) {

        char letter = 'D';
        switch (letter) {
            case 'A':
                System.out.println("The letter is A");
                break;

            case 'B':
            case 'C':
                System.out.println("The letter is B or C");
                break;

            case 'D':
                System.out.println("You've found the letter! It's D");
                break;

            default:
                System.out.println("The letter is not A, B, C or D");
                break;
        }
    }
}


