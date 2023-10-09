package Sorting;

import java.util.Scanner;

public class RecursiveBubbleSort {
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

    static void sortArr(int[] arr, int endIndex) {
        if(arr.length == 0) {
            return;
        }

        if(endIndex == 0) {
            return;
        }

        for(int i = 0; i < endIndex; i++) {
            if(arr[i] > arr[i+1]) swap(arr, i+1, i);
        }

        sortArr(arr, endIndex-1);
    }

    public static void recursiveBubbleSort(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        sortArr(arr, arr.length-1);
        printArr(arr);
    }
}
