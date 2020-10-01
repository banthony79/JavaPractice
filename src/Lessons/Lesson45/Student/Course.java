package Lessons.Lesson45.Student;

import java.sql.Time;
import java.util.LinkedList;
import java.util.Random;

public class Course {

    private static Random rand = new Random();


    private final String courseName;
    private final String courseID;
    private LinkedList<Student> students;
    private double grade;


    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.students = new LinkedList();
        this.grade = rand.nextInt(50) + 50;
    }


    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean enroll(Student student) {
       return students.add(student);

    }

    public String toString() {
        return courseID + ": " + "\t" + courseName.toUpperCase() + "\t" + grade;
    }


}
