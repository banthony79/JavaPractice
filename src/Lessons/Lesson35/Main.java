package Lessons.Lesson35;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInnerClass();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        scopeInstance.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("====================================");
        innerClass.timesTwo();
    }
}
