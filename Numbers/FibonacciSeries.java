package Numbers;

import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacci(int n) {

        int first = 0;
        int second = 1;

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        if (n == 1) {
            System.out.println("Fibonacci Series: " + first);
            return;
        }

        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);

            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}