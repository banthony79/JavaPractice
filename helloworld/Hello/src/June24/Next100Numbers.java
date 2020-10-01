package June24;

import java.util.Scanner;

public class Next100Numbers {

//calculate the sum of the next 100 numbers after an integer is entered.


        public static void main(String[] args) {
            System.out.println("Please enter the number to calculate.");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int sum = 0;

            for (int i = 0; i <= num+100; i++){
                sum += i;

            }

            System.out.println("The sum of the numbers is " +  sum);
        }

    }


