package Lessons.Lesson12;

public class Switch {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value was one");
        } else if (value == 2) {
            System.out.println("Value was two");
        } else {
            System.out.println("Value was not one or two");
        }

        int switchValue = 1;
        switch (switchValue) { //switch(variable to test)
            case 1: //doing the equivalent of if (value==1)
                System.out.println("Value was one");
                break;

            case 2:
                System.out.println("Value was two");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3 or 4 or 5");
                break;

            default:
                System.out.println("was not one or two");
                break;
        }

    }
}
