package PersonalStuff.Student;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static List list = new List();
    public static String studentUpdated = "STUDENT HAS BEEN UPDATED";

    public static void main(String[] args) {
        showOptions();
        boolean quit = false;
        while (!quit) {
            System.out.println("Please choose from one of the following options");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    list.printStudents();
                    break;
                case 2:
                    addAStudent();
                    break;
                case 3:
                    removeAStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    showOptions();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }


    }

    public static void showOptions() {

        System.out.println("\t 1. Show Employee List");
        System.out.println("\t 2. Add Employee");
        System.out.println("\t 3. Remove Employee");
        System.out.println("\t 4. Update Grades");
        System.out.println("\t 5. Show options again");
        System.out.println("\t 6. Quit");
    }

    public static void showChangeOptions() {

        System.out.println("\t 1. Change Phone Number");
        System.out.println("\t 2. Change English Grade");
        System.out.println("\t 3. Change Math Grade");
        System.out.println("\t 4. Change Science Grade");
        System.out.println("\t 5. Back to SetMain Menu");
    }

    private static void addAStudent() {
        System.out.println("Please enter student's name");
        String studentName = scanner.nextLine();
        System.out.println("Please enter student's phone number");
        String studentPhoneNumber = scanner.nextLine();
        System.out.println("Please enter student's science grade");
        double science = scanner.nextDouble();
        System.out.println("Please enter student's math grade");
        double math = scanner.nextDouble();
        System.out.println("Please enter student's English grade");
        double english = scanner.nextDouble();
        //Employee newStudent = new Employee(studentName, studentPhoneNumber, math, science, english);
        if (list.addStudent(studentName, studentPhoneNumber, math, science, english)) {
            System.out.println(studentName + " has been added successfully.");
        } else {
            System.out.println("Cannot add " + studentName + ", already on file.");

        }
    }


    private static void removeAStudent() {
        System.out.println("Please enter student's name you would like to delete");
        String name = scanner.nextLine();
        Student existingRecord = list.findStudentName(name);
        if (existingRecord == null) {
            System.out.println("student not found");
        }
        list.removeStudent(name);
        System.out.println(name + " has been deleted.");
    }

    public static void updateStudent() {
        System.out.println("Please enter the student you want to update");
        String studentName = scanner.nextLine();
        Student student = list.locateStudent(studentName);
        if (list.locateStudent(studentName) != null) {
            showChangeOptions();
            System.out.println("Please make a selection");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter new number");
                    String newNumber = scanner.nextLine();
                    list.updatePhoneNumber(student, newNumber);
                    System.out.println(studentUpdated);
                    break;
                case 2:
                    System.out.println("Please enter English new grade");
                    double newGrade = scanner.nextInt();
                    list.updateEnglishGrade(newGrade, student);
                    System.out.println(studentUpdated);
                    break;
                case 3:
                    System.out.println("Please enter new math grade");
                    double newMathGrade = scanner.nextInt();
                    list.updateMathGrade(student, newMathGrade);
                    System.out.println(studentUpdated);
                    break;
                case 4:
                    System.out.println("Please enter new science grade");
                    double newScienceGrade = scanner.nextInt();
                    list.updateScienceGrade(newScienceGrade, student);
                    System.out.println(studentUpdated);
                    break;
                case 5:
                    break;

            }
        } else {
            System.out.println("Employee doesn't exist");
        }
    }

}






