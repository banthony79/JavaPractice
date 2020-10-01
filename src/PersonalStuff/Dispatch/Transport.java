package PersonalStuff.Dispatch;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Transport {


    public static ArrayList<Truck> truckList = new ArrayList<Truck>();
    public static ArrayList<TruckDriver> truckDrivers = new ArrayList<TruckDriver>();
    public static ArrayList<Hauler> haulers = new ArrayList<Hauler>();


    public boolean newDriver(String driverName, String licenseNumber, String phoneNumber) {
        if (findDriver(driverName) == null) {
            truckDrivers.add(new TruckDriver(driverName, licenseNumber, phoneNumber));
            return true;

        }

        return false;
    }

    public static ArrayList<TruckDriver> getTruckDrivers() {
        return truckDrivers;
    }


    public ArrayList<Truck> getTruckList() {
        return truckList;
    }

    public static ArrayList<Hauler> getHaulers() {
        return haulers;
    }

    public TruckDriver findDriver(String driverName) {
        for (int i = 0; i < truckDrivers.size(); i++) {
            TruckDriver checkedDriver = truckDrivers.get(i);
            if (truckDrivers.get(i).getDriverName().equals(driverName)) {
                return checkedDriver;
            }
        }
        return null;
    }


    public boolean newHauler(String name, String ownerName, String ownerPhoneNumber) {
        if (findHauler(name) == null) {
            haulers.add(new Hauler(name, ownerName, ownerPhoneNumber));
            return true;

        }

        return false;
    }

    public Hauler findHauler(String haulerName) {
        for (int i = 0; i < haulers.size(); i++) {
            Hauler checkedHauler = haulers.get(i);
            if (haulers.get(i).getName().equals(haulerName)) {
                return checkedHauler;
            }
        }
        return null;
    }


    public boolean newTruck(int truckNumber, String haulerName, String driverName, int tareWeight) {
        Hauler hauler = findHauler(haulerName);
        TruckDriver truckDriverName = findDriver(driverName);
        truckList.add(new Truck(truckNumber, hauler, truckDriverName, tareWeight));
        return true;

    }


    private Truck findTruck(String truckNumber) {
        for (int i = 0; i < truckList.size(); i++) {
            Truck checkedTruck = truckList.get(i);
            if (checkedTruck.equals(truckNumber)) {
                return checkedTruck;
            }
        }
        return null;
    }

    private int findTruckNumber(String truckNumber) {
        for (int i = 0; i < truckList.size(); i++) {
            Truck checkedTruck = truckList.get(i);
            if (checkedTruck.equals(truckNumber)) {
                return i;
            }
        }

        return -1;
    }

    /*public boolean assignDriver(String truckNumber, String driverName) {
        findTruck(truckNumber).getTruckDriver(findDriver(driverName));
        System.out.println(truckNumber + " now has " + driverName + " in it.");
        return true;

    }*/


    public void displayTrucks(ArrayList<Truck> truckList) {
        ArrayList<String> truckArrayList = new ArrayList<String>();
        System.out.println("TRUCK LIST");
        System.out.println("==============");

        for (int i = 0; i < truckList.size(); i++) {
            Truck checkedTruck = truckList.get(i);
            truckArrayList.add(i, checkedTruck.toString());
        }
        Collections.sort(truckArrayList);

        for (int j = 0; j < truckArrayList.size(); j++) {
            System.out.println(truckArrayList.get(j));

        }
        System.out.println("Truck Count: " + truckArrayList.size());
    }

    public void displayDrivers(ArrayList<TruckDriver> driverList) {
        ArrayList<String> driverArrayList = new ArrayList<String>();
        System.out.println("");
        System.out.println("DRIVER LIST");
        System.out.println("===============");
        for (int i = 0; i < driverList.size(); i++) {
            TruckDriver checkedDriver = driverList.get(i);
            driverArrayList.add(i, checkedDriver.toString());
        }

        Collections.sort(driverArrayList);

        for (int j = 0; j < driverArrayList.size(); j++) {
            System.out.println(driverArrayList.get(j));


        }
        System.out.println("Number of drivers: " + driverList.size());
    }


    public void displayOwners(ArrayList<Hauler> haulerList) {
        ArrayList<String> haulerArrayList = new ArrayList<String>();
        System.out.println("");
        System.out.println("HAULER LIST");
        System.out.println("===============");
        for (int i = 0; i < haulerList.size(); i++) {
            Hauler testHauler = haulerList.get(i);
            haulerArrayList.add(i, testHauler.toString());
        }

        Collections.sort(haulerArrayList);

        for (int j = 0; j < haulerArrayList.size(); j++) {
            System.out.println(haulerArrayList.get(j));

        }
    }
}







