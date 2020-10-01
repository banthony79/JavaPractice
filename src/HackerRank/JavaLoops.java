package HackerRank;

public class JavaLoops {

    public static void main(String[] args) {


        //a+2^0*b
        // +2^1*b
        // +2^2*b
        // +2^3*b+........+2^n-1*b

        int q = 10;
        int a = 0;
        int b = 2;
        int n = 5;
        int answer = 0;
        int sum = 0;
        int npower = n - 1;
        int fourcount = 0;

          /*  answer = ((a + (Math.pow(2,0) * b)));
            System.out.println(answer);
            answer = answer + (Math.pow(2, 1) * b);
            System.out.println(answer);
            answer = answer + (Math.pow(2, 2) * b);
            System.out.println(answer);
            answer = answer + (Math.pow(2, 3) * b);
            System.out.println(answer);
            answer = answer + (Math.pow(2, npower) * b);
            System.out.println(answer); */


        for (int i = 0; i <= q - 1; i++) {
            if (i == 0) {
                answer = (int) ((a + (Math.pow(2, i) * b)));
                System.out.println("First number: " + answer);
            }
            if (i == 1 || i == 2 || i == 3) {
                answer = (answer + (int) (Math.pow(2, i) * b));
                System.out.println("Second number: " + answer);
            }
            if (i == 4) {
                answer = answer + (int) (Math.pow(2, npower) * b);
                System.out.println("Third number: " + answer);
            }

            if (i > 4) {
                answer = answer + (int) (Math.pow(2, i) * b);
                System.out.println("Fourth and beyond: " + answer);
            }
        }
    }
    // System.out.println(answer); }

    }




