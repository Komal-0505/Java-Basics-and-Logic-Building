package Numbers;

import java.util.Scanner;

public class ArmstrongNumber {

    // Method to check whether a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int temp = number;
        int digits = 0;

        // Count the number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Handle the case when number is 0
        if (number == 0) {
            digits = 1;
        }

        int sum = 0;
        temp = number;

        // Calculate the sum of each digit raised to the power of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        // Handle the case when number is 0
        if (number == 0) {
            sum = 0;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}