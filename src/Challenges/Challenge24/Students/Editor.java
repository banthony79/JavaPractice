package Challenges.Challenge24.Students;


import java.util.ArrayList;

public class Editor {

    private ArrayList<Student> myStudents;


    public boolean addNewStudent(Student student) {
        if (findStudent(student.getStudentName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myStudents.add(student);
        return true;
    }


    private int findStudent(Student student) {
        return this.myStudents.indexOf(student);
    }

    public boolean updateStudent(Student oldstudent, Student newStudent) {
        int foundposition = findStudent(oldstudent);
        if (foundposition < 0) {
            System.out.println(oldstudent.getStudentName() + " was not found.");
            return false;
        }
        this.myStudents.set(foundposition, newStudent);
        System.out.println(oldstudent.getStudentName() + " was replaced with " + newStudent.getStudentName());
        return true;
    }

    private int findStudent(String studentName) {
        for (int i = 0; i < myStudents.size(); i++) {
            Student student = this.myStudents.get(i);
            if (student.getStudentName().equals(studentName)) ;
            {
                return i;
            }
        }
        return -1;
    }

    public String queryStudent(Student student) {
        if (findStudent(student) >= 0) {
            return student.getStudentName();
        }
        return null;
    }

    public boolean removeContact(Student student) {
        int foundposition = findStudent(student);
        if (foundposition < 0) {
            System.out.println("That contact does not exist");
            return false;
        } else {
            this.myStudents.remove(foundposition);
            System.out.println(student.getStudentName() + " was deleted.");
            return true;
        }
    }

    public Student queryStudent(String name) {
        int position = findStudent(name);
        if (position >= 0) {
            return this.myStudents.get(position);
        }
        return null;
    }


    public void printContacts() {
        System.out.println("\n Contact List");
        for (int i = 0; i < this.myStudents.size(); i++) {
            System.out.println((i + 1 + " - " + this.myStudents.get(i).
                    getStudentName()) + this.myStudents.get(i).getPhoneNumber());
        }
    }

}


