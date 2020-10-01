package Challenges.Challenge25.BrycesSolution;

import java.util.ArrayList;

public class Bank {

    public static ArrayList<Branch> branches;


    public boolean addNewBranch(String newBranch) {
        if (findBranch(newBranch) == null) {
            System.out.println("That branch already exists");
            return false;
        }
        this.branches.add(new Branch(newBranch));
        return true;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }


}
