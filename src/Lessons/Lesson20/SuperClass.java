package Lessons.Lesson20;

public class SuperClass {

    public void printMethod() {
        System.out.println("Printed in superclasss");
    }
}

class subClass extends SuperClass { //subbase aka child class
    //Override method from parent
    @Override
    public void printMethod() {
        System.out.println("Printed in subclass");
    }
}

class MainClass {
    public static void main(String[] args) {
        subClass s = new subClass();
        s.printMethod();
    }
}


