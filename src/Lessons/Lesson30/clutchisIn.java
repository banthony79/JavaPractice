package Lessons.Lesson30;

public class clutchisIn {

    private boolean clutchisIN;

    public void operateClutch(boolean inOrOut) {
        this.clutchisIN = inOrOut;
    }

    public static void main(String[] args) {
        clutchisIn clutch = new clutchisIn();

        clutch.operateClutch(false);

        System.out.println(clutch.clutchisIN);
    }
}
