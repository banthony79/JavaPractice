package Lessons.Lesson30;

public class MobilePhone implements ITelephone {


    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now Ringing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = true;
        } else {
            isRinging = false;
            System.out.println("Phone is not on or number is different");
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring Ring");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }

}
