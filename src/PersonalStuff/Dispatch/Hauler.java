package PersonalStuff.Dispatch;

import java.util.ArrayList;

public class Hauler {

    private String name;
    private String ownerName;
    private String ownerPhoneNumber;

    public Hauler(String name, String ownerName, String ownerPhoneNumber) {
        this.name = name;
        this.ownerName = ownerName;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    @Override
    public String toString() {
        return name + ", " +
                ownerName + ", " +
                "Ph #: " + ownerPhoneNumber;
    }
}
