package PersonalStuff.Dispatch;

import java.util.ArrayList;

public class Truck {

    private int truckNumber;
    private Hauler hauler;
    private TruckDriver truckDriver;
    private boolean isTandem;
    private int tareWeight;

    public Truck(int truckNumber, Hauler hauler, TruckDriver truckDriver, int tareWeight) {
        this.truckNumber = truckNumber;
        this.hauler = hauler;
        this.truckDriver = truckDriver;
        this.tareWeight = tareWeight;
        if (tareWeight > 14000) {
            this.isTandem = false;
        } else {
            this.isTandem = true;
        }

    }

    public int getTruckNumber() {
        return truckNumber;
    }

    public Hauler getHauler() {
        return hauler;
    }

    public TruckDriver getTruckDriver() {
        return truckDriver;
    }

    public String isTandem() {
        if (isTandem) {
            return "Tandem: Yes";
        } else {
            return "Tandem: No";
        }
    }

    public int getTareWeight() {
        return tareWeight;
    }

    @Override
    public String toString() {
        if (truckNumber < 100) {
            return "0" + truckNumber +
                    ", " + hauler.getName() +
                    ", " + truckDriver.getDriverName() +
                    ", " + isTandem() +
                    ", " + tareWeight +
                    '}';
        } else {
            return truckNumber +
                    ", " + hauler.getName() +
                    ", " + truckDriver.getDriverName() +
                    ", " + isTandem() +
                    ", " + tareWeight;
        }

    }


}
