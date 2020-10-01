package Challenges.Challenge24.Challenge24b;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<String> nameList = new ArrayList<String>();
    private ArrayList<String> numberList = new ArrayList<String>();

    public void displayContacts() {
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + ": " + nameList.get(i) + " - " + numberList.get(i));
        }
    }


    public void addPhoneNumber(String phoneNumber) {
        numberList.add(phoneNumber);
    }

    public void addName(String name) {
        nameList.add(name);
    }

    public void removeContactByName(String name) {
        int position = findName(name);
        numberList.remove(position);
        nameList.remove(position);
        System.out.println(name + " has been removed from your contacts");
    }


    public void modifyContactName(String name, String newName) {
        int position = findName(name);
        if (position >= 0) {
            modifyContactName(position, newName);
        }
    }

    private void modifyContactName(int position, String newName) {
        nameList.set(position, newName);
        System.out.println(nameList.get(position) + " has been modified");
    }


    public void modifyContactNumber(String name, String newNumber) {
        int position = findName(name);
        if (position >= 0) {
            modifyContactNumber(position, newNumber);
        }
    }

    private void modifyContactNumber(int position, String newNumber) {
        numberList.set(position, newNumber);
        System.out.println(nameList.get(position) + " has been modified");
    }

    public boolean exists(String name, String phoneNumber) {
        int namePosition = findName(name);
        int numberPosition = findNumber(phoneNumber);
        if (namePosition >= 0 && numberPosition >= 0) {
            return true;
        } else {
            return false;
        }
    }


    public int findName(String name) {
        return nameList.indexOf(name);
    }

    public int findNumber(String phoneNumber) {
        return numberList.indexOf(phoneNumber);
    }
}

