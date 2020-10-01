package PersonalStuff.Flatlanders;

public class Truck {

    int truckNumber;
    boolean isTandem;

    public int getTruckNumber() {
        return truckNumber;
    }

    public boolean isTandem() {
        return isTandem;
    }

    public Truck(int truckNumber, boolean isTandem) {
        this.truckNumber = truckNumber;
        this.isTandem = isTandem();
    }


}
