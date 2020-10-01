package Challenges.Challenge24.Students;

import java.util.ArrayList;

public class Student {

    private String name;
    private String phoneNumber;
    private int mathGrade;
    private int englishGrade;
    private int scienceGrade;


    public Student(String name, String phoneNumber, int mathGrade, int englishGrade, int scienceGrade) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }

    public String getStudentName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getScienceGrade() {
        return scienceGrade;
    }

    public int getAverage() {
        return (mathGrade + englishGrade + scienceGrade) / 3;
    }

    public static Student createStudent(String name, String phoneNumber, int mathGrade, int englishGrade, int scienceGrade) {
        return new Student(name, phoneNumber, mathGrade, englishGrade, scienceGrade);
    }
}

