package BasicRecursion;

import java.util.Scanner;

public class ReverseArray {
    static int[] inputArray(int n) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[n];
        System.out.println("Enter array upto "+ n +" elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    static void swap(int i, int j, int[] arr) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    // static int[] reverseArray(int i, int j, int[] arr) {
    //     if(i >= j) {
    //         return arr;
    //     }

    //     swap(i, j, arr);
    //     return reverseArray(i+1, j-1, arr);
    // }

    static int[] reverseArray(int i, int n, int[] arr) {
        if(i >= n/2) {
            return arr;
        }

        swap(i, n-i-1, arr);
        return reverseArray(i+1, n, arr);
    }

    static void printArray(int[] arr) {
        System.out.print("Reversed Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    public static void printReverseArray(int n) {
        int[] arr = inputArray(5);
        // int[] reverseArray = reverseArray(0, n-1, arr);
        int[] reverseArray = reverseArray(0, n, arr);
        printArray(reverseArray);
        System.out.println();
    }
}