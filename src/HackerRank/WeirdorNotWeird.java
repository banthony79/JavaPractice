package HackerRank;

import java.util.Scanner;

public class WeirdorNotWeird {

    public static void main(String[] args) {

        String ans;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 100) {
            ans = "Not Weird";
        } else if ((n % 2 == 0) && (n >= 2) && (n <= 5)) {
            ans = "Not Weird";
        } else if ((n % 2 == 0) && (n > 20)) {
            ans = "Not Weird";
        } else ans = "Weird";
        System.out.println(ans);

    }
}
