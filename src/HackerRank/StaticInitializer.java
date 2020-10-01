package HackerRank;

public class StaticInitializer {

    static int area;
    static int B;
    static int H;

    static {
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            area = B * H;
        }
    }

    private static boolean flag = true;

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

