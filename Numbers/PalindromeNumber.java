package Numbers;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is not a Palindrome Number.");
        }

        sc.close();
    }
}