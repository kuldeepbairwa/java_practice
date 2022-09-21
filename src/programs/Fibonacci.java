package programs;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = 0, b = 1, count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            System.out.println(b);
            a = temp;
            count++;
        }

        System.out.println(n + "th fibonacci no. is " + b);
    }
}
