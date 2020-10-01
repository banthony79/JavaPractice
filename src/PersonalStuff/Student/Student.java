package PersonalStuff.Student;

public class Student {

    private String name;
    private String phoneNumber;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;


    public Student(String name, String phoneNumber, double mathGrade, double scienceGrade, double englishGrade) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double getMathGrade() {
        return this.mathGrade;
    }

    public double getScienceGrade() {
        return this.scienceGrade;
    }

    public double getEnglishGrade() {
        return this.englishGrade;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getAverage() {
        return (getMathGrade() + getScienceGrade() + getEnglishGrade()) / 3;

    }
}




