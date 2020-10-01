package Lessons.Lesson12;

public class SwitchString {

    public static void main(String[] args) {
        String month = "January";
        switch (month) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
        }

        month = "FebruARY";
        switch (month.toLowerCase()) { //converts string to all lower case
            case "february":
                System.out.println("The month is February");
                break;
            case "march":
            case "april":
            case "june":
                System.out.println("The month isn't March, April or May");
                break;
        }

    }
}
