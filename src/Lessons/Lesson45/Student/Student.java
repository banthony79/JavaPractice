package Lessons.Lesson45.Student;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.sql.SQLOutput;
import java.util.*;

public class Student {

    private final String studentName;
    private final int age;
    private final Set<Course> courses;
    private final int studentID;
    private static Random rand = new Random();
    static int number = 1000;


    public Student(String studentName, int age) {
        number = number + 1;
        this.studentName = studentName;
        this.age = age;
        this.studentID = number;
        this.courses = new HashSet<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public int getStudentID() {
        return studentID;
    }

    public Set getCourses() {
        return courses;
    }

    public String toString() {
        return studentID + ": " + "\t" + studentName + " - " + "\t" + age;

    }

    private static Set<Integer> integerSet = new HashSet<>();

    private void randomNumbers() {

    }

    public boolean courseLoad(LinkedList<Course> courseLinkedList) {
        for (int i = 1; i <= 5; i++) {
            int num = rand.nextInt(courseLinkedList.size());
            Course testCourse = courseLinkedList.get(num);
            courses.add(testCourse);
            testCourse.enroll(this);
        }
        return true;
    }

    public void listCourses() {
        System.out.println(studentName + " course list contains:");
        Iterator<Course> i = courses.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().toString());

        }
        System.out.println();
        System.out.println("Average: " + this.getAverage() + "%");
        System.out.println("Student has a " + getLetterGrade(this.getAverage()) + " grade.") ;
    }


    public char getLetterGrade(double average) {
       if (average >= 90 && average <= 100)  {
           return 'A';
       } else if (average < 90 && average >= 80) {
           return 'B';
       } else if (average < 80 && average >= 70) {
           return 'C';
       } else if (average < 70 && average >= 60) {
           return 'D';
       } else {
           return 'F';
       }
    }

    public double getAverage() {
        double sum = 0;
        double avg = 0;
        Iterator<Course> itr = courses.iterator(); {
            while (itr.hasNext()) {
                sum = sum + itr.next().getGrade();
                avg = sum/courses.size();

        }

    }
return avg; }


}




