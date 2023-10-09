package Sorting;

import java.util.Scanner;

public class RecursiveInsertionSort {
    static void inputArr(int[] arr, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    static void sortArr(int[] arr, int startIndex) {
        if(startIndex > arr.length-1) {
            return;
        }

        for(int j = startIndex-1; j >= 0; j--) {
            if(arr[j+1] < arr[j]) swap(arr, j+1, j);
        }

        sortArr(arr, startIndex+1);
    }

    public static void recursiveInsertionSort(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        sortArr(arr, 1);
        printArr(arr);
    }
}
