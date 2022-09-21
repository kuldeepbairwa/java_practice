package programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        int rev = 0, rem = 0;
        System.out.println("Enter a number to reverse:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {

            rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
