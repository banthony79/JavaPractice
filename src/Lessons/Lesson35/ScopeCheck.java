package Lessons.Lesson35;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", PrivateVar: " + varOne);
    }

    public int getPublicVar() {
        return publicVar;
    }

    public int getPrivateVar() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varthree from outer class " + innerClass.varThree);
    }


    public class InnerClass {
        public int varThree = 3;


        public void timesTwo() {
            System.out.println("varOne is still available here");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }

    }


}
