package Lessons.Lesson30;

public class Main {

    public static void main(String[] args) {
        ITelephone brycesPhone;
        brycesPhone = new DeskPhone(123456);
        brycesPhone.powerOn();
        brycesPhone.callPhone(123456);
        brycesPhone.answer();

        brycesPhone = new MobilePhone(24565);
        brycesPhone.callPhone(24565);
        brycesPhone.answer();
    }
}
