package Lessons.Lesson37;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");

        System.out.println(firstInstance.getName() + " is an instance number " +
                StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");

        System.out.println(secondInstance.getName() + " is an instance number " +
                StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd Instance");

        System.out.println(thirdInstance.getName() + " is an instance number " +
                StaticTest.getNumInstances());
    }
}
