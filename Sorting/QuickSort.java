package Sorting;

import java.util.Scanner;

public class QuickSort {

    static void inputArr(int[] arr, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    static int partition(int[] arr, int pivot, int low, int high) {
        int i = low, j = low;
        while(i <= high) {
            if(arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else i++;
        }
        return j-1;
    }

    static void sortArr(int[] arr, int low, int high) {
        if(low >= high) return;
        int pivot = arr[low];
        int pIndex = partition(arr, pivot, low, high);
        sortArr(arr, low, pIndex-1);
        sortArr(arr, pIndex+1, high);
    }

    public static void quickSort(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        sortArr(arr, 0, arr.length-1);
    }
}
