package Lessons.Lesson45.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class School {

    private final String name;
    private final LinkedList<Student> masterStudentList;
    private final LinkedList<Course> courseList;

    public School(String name) {
        this.name = name;
        this.masterStudentList = new LinkedList<>();
        this.courseList = new LinkedList<>();
    }

    private static Random rand = new Random();

    public String getName() {
        return name;
    }

    public LinkedList<Student> getMasterStudentList() {
        return masterStudentList;
    }


    public boolean addCourse(Course course) {
        return courseList.add(course);
    }

    public Student enrollStudent(String name, int age) {
        Student student = new Student(name, age);
        student.courseLoad(courseList);
        masterStudentList.add(student);
        return student;
    }



    public void displayStudents() {
        for (int i = 0; i < masterStudentList.size(); i++) {
            System.out.println(masterStudentList.get(i).toString());
        }
    }

    public Student returnStudentbyID(int studentID) {
        for (int i = 0; i < masterStudentList.size(); i++) {
             if (masterStudentList.get(i).getStudentID()==studentID) {
                 return masterStudentList.get(i);
             }
         }
  return null;   }





}
