package Lessons.Lesson37;

public class StaticTest {

    private static int numInstances = 0;
    private String name;

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }
}
