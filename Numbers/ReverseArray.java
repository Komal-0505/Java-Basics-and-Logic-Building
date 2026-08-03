package Numbers;

import java.util.Scanner;

public class ReverseArray {

    // Method to reverse the array
    public static void reverse(int[] arr, int n) {

        int start = 0;
        int end = n - 1;

        while (start < end) {

            // Swap the elements
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array
        reverse(arr, n);

        // Print reversed array
        System.out.println("Reversed Array:");
        printArray(arr);

        sc.close();
    }
}

/*public static void reverse(int[] arr, int n) {

    int start = 0;
    int end = n - 1;

    while (start < end) {

        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

        start++;
        end--;
    }
} */