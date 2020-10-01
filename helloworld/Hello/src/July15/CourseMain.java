package July15;

public class CourseMain {

    public static void main(String[] args) {
        Instructor brendan = new Instructor();
        Instructor jimmy = new Instructor();
        Student john = new Student(6);
        Student jake = new Student(7);
        Course math = new Course(1, "Math", "Add things", brendan);
        Course science = new Course(2, "Science", "Do science", jimmy);
        Registration johnReg = new Registration(math.getId(), 50);
        Registration johnReg2 = new Registration(science.getId(), 100);
        Registration jakeReg = new Registration(science.getId(), 0);

        math.register(johnReg, john);
        science.register(johnReg2, john);
        science.register(jakeReg, jake);
        System.out.println(john.calcAverage());
    }
}