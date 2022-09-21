package programs;

import java.util.Scanner;

public class DigitOccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        int count = 0;
        System.out.println("Enter a number:");

        m = sc.nextInt();
        System.out.println("Enter a digit to check occurance");
        n = sc.nextInt();

        while (m > 0) {
            int rem = m % 10;
            if (rem == n) {
                count++;
            }
            m /= 10;
        }
        System.out.println(count);

    }

}

