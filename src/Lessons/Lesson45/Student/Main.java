package Lessons.Lesson45.Student;

import java.util.*;

public class Main {


    public static School school = new School("Looyenga High");
    public static Random random = new Random(5);

    private static Map<Integer, Student> students = new HashMap();

    public static void main(String[] args) {


        Course temp = new Course("Biology", "B1010");
        school.addCourse(temp);
        temp = new Course("MathA30", "A5637");
        school.addCourse(temp);
        temp = new Course("Trigonometry", "B0134");
        school.addCourse(temp);
        temp = new Course("English", "C4563");
        school.addCourse(temp);
        temp = new Course("French", "C4571");
        school.addCourse(temp);
        temp = new Course("Spanish", "C4537");
        school.addCourse(temp);
        temp = new Course("Computer Science", "A5689");
        school.addCourse(temp);
        temp = new Course("Calculus", "C5566");
        school.addCourse(temp);
        temp = new Course("MathB30", "B1410");
        school.addCourse(temp);
        temp = new Course("History", "A55433");
        school.addCourse(temp);
        temp = new Course("Chemistry", "B2134");
        school.addCourse(temp);
        temp = new Course("Woodworking", "C4463");
        school.addCourse(temp);
        temp = new Course("Economics", "C4571");
        school.addCourse(temp);

        Student newStudent = school.enrollStudent("Jenny Duncan", 15);
        students.put(newStudent.getStudentID(), newStudent);
        newStudent = school.enrollStudent("Benton Schuessler", 17);
        students.put(newStudent.getStudentID(), newStudent);
        newStudent = school.enrollStudent("Emelia Hollomon", 14);
        students.put(newStudent.getStudentID(), newStudent);
        newStudent = school.enrollStudent("Vanda Bjorklund", 15);
        students.put(newStudent.getStudentID(), newStudent);
        newStudent = school.enrollStudent("Karey Sanjuan", 16);
        students.put(newStudent.getStudentID(), newStudent);
        newStudent = school.enrollStudent("Marshall Poston", 17);
        students.put(newStudent.getStudentID(), newStudent);

        school.displayStudents();
        displayCourses();

    }




    public static void displayCourses() {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {

            System.out.println("Please enter student ID");
            int studentID = scanner.nextInt();
            if (studentID == 99) {
                break;
            }
            students.get(studentID).listCourses();

        }


    }


    }


