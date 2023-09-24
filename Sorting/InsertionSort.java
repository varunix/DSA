package Sorting;

import java.util.Scanner;

public class InsertionSort {
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

    static int[] sortArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j = i;
            while(j>0 && arr[j]<arr[j-1]) {
                swap(arr, j, j-1);
                j--;
            }
        }
        return arr;
    }

    public static void insertionSort(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        int[] sortedArr = sortArr(arr);
        printArr(sortedArr);
    }
}
