package ComIT.ComIT4.EmployeeSurveyUpdate;

import com.sun.tools.javah.Gen;

public class Participant {

    private int idNumber;
    private Gender gender;
    boolean employed;
    private int salary;

    private static int count = 0;


    public Participant(Gender gender, boolean employed, int salary) {
        count++;
        this.idNumber = count;
        this.employed = employed;
        this.salary = salary;
        this.gender = gender;

    }

    public enum Gender {
        MALE,
        FEMALE,
    }

    public Gender getGender() {
        return gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public boolean isEmployed() {
        return employed;
    }

    public int getSalary() {
        return salary;
    }



    public String toString() {
        return "ID: " + this.idNumber + "\n" +
                "Salary: " + this.salary +  "\n" +
                "Gender: " + this.gender + "\n" +
                "Employed: " + this.employed;


    }
}
