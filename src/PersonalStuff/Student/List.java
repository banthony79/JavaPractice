package PersonalStuff.Student;

import PersonalStuff.Student.Student;

import java.util.*;


public class List {

    ArrayList<Student> studentArraylist = new ArrayList<Student>();

    public Student locateStudent(String studentName) {
        for (int i = 0; i < studentArraylist.size(); i++) {
            Student checkedStudent = this.studentArraylist.get(i);
            if (checkedStudent.getName().equals(studentName)) {
                return checkedStudent;

            }
        }
        return null;
    }


    public boolean addStudent(String studentName, String phoneNumber, double englishGrade, double scienceGrade, double mathGrade) {
        if (findStudent(studentName) == null) {
            this.studentArraylist.add(new Student(studentName, phoneNumber, mathGrade, scienceGrade, englishGrade));
            return true;
        }

        return false;
    }


    private int findStudent(Student student) {
        return studentArraylist.indexOf(student);
    }

    public Student findStudentName(String name) {
        for (int i = 0; i < studentArraylist.size(); i++) {
            Student student = this.studentArraylist.get(i);
            if (student.getName().equals(name)) {
                return studentArraylist.get(i);
            } else {
                return null;
            }
        }
        return null;


    }


    public boolean removeStudent(String name) {
        if (locateStudent(name) != null) {
            studentArraylist.remove(findStudent(name));
            return true;
        } else {
            return false;
        }
    }


    public double updateEnglishGrade(double newGrade, Student student) {
        student.setEnglishGrade(newGrade);
        return newGrade;
    }


    public double updateScienceGrade(double newGrade, Student student) {
        student.setScienceGrade(newGrade);
        return newGrade;
    }

    public double updateMathGrade(Student student, double newGrade) {
        student.setMathGrade(newGrade);
        return newGrade;
    }


    public String updatePhoneNumber(Student student, String newPhoneNumber) {
        student.setPhoneNumber(newPhoneNumber);
        return newPhoneNumber;
    }

    public void printStudents() {
        for (int i = 0; i < studentArraylist.size(); i++) {
            System.out.println("Name:" + studentArraylist.get(i).getName()
                    + "\t \n Phone Number " + studentArraylist.get(i).getPhoneNumber()
                    + "\t \n English Grade: " + studentArraylist.get(i).getEnglishGrade()
                    + "\t \n Science Grade:" + studentArraylist.get(i).getScienceGrade()
                    + "\t \n Math Grade: " + studentArraylist.get(i).getMathGrade()
                    + "\t \n Average: " + studentArraylist.get(i).getAverage());
        }

    }


    private Student findStudent(String studentName) {
        for (int i = 0; i < studentArraylist.size(); i++) {
            Student checkedStudent = this.studentArraylist.get(i);
            if (this.studentArraylist.get(i).getName().equals(studentName)) {
                return checkedStudent;
            }
        }
        return null;
    }

  /*public String queryStudent(Employee student) {
        if (findStudentPosition(student.getName()) >= 0) {
            return student.getName();
        } else {
            return null;
        }
    }*/

   /* public int queryStudent(String name) {
        int position = findStudentPosition(name);
        System.out.println(position);
        if (position >= 0) {
            return position;
        } else {
            return -1;
        }
    }*/


    public Student queryStudentclass(String name, Student student) {
        if (locateStudent(name) == null) {
            return null;
        } else {
            return student;
        }


    }

}





