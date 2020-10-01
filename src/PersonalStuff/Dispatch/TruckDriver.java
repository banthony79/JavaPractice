package PersonalStuff.Dispatch;

import java.util.ArrayList;

public class TruckDriver {

    private String driverName;
    private String licenseNumber;
    private String driverPhoneNumber;


    public TruckDriver(String driverName, String licenseNumber, String driverPhoneNumber) {
        this.driverName = driverName;
        this.licenseNumber = licenseNumber;
        this.driverPhoneNumber = driverPhoneNumber;

    }


    public String getDriverName() {
        return driverName;
    }


    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    @Override
    public String toString() {
        return driverName + " ," +
                "License #: " + licenseNumber + ", " +
                "Ph #: " + driverPhoneNumber;
    }
}
