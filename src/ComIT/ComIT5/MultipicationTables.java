package ComIT.ComIT5;

public class MultipicationTables {


    public static void main(String[] args) {

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;


        System.out.println("***Multiples of One***");
        for (int i = 1; i < 11; i++) {
            num1++;
            int sum = 1 * num1;
            System.out.println(1 + " * " + num1 + " = " + sum);
        }

        System.out.println("***Multiples of Two***");
        for (int i = 1; i < 11; i++) {
            num2++;
            int sum = 2 * num2;
            System.out.println(2 + " * " + num2 + " = " + sum);
        }

        System.out.println("***Multiples of Three***");
        for (int i = 1; i < 11; i++) {
            num3++;
            int sum = 3 * num3;
            System.out.println(3 + " * " + num3 + " = " + sum);
        }

        System.out.println("***Multiples of Four***");
        for (int i = 1; i < 11; i++) {
            num4++;
            int sum = 4 * num4;
            System.out.println(4 + " * " + num4 + " = " + sum);
        }

        System.out.println("***Multiples of Five***");
        for (int i = 1; i < 11; i++) {
            num5++;
            int sum = 5 * num5;
            System.out.println(5 + " * " + num5 + " = " + sum);
        }

        System.out.println("***Multiples of Six***");
        for (int i = 1; i < 11; i++) {
            num6++;
            int sum = 6 * num6;
            System.out.println(6 + " * " + num6 + " = " + sum);
        }
    }
}
