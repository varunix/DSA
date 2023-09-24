package Sorting;

import java.util.Scanner;

public class BubbleSort {
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
        // for(int i = arr.length-1; i >= 1; i--) {
        //     int didSwap = 0;
        //     for(int j = 0; j <= i-1; j++) {
        //         if(arr[j] > arr[j+1]) {
        //             swap(arr, j, j+1);
        //             didSwap = 1;
        //         }
        //     }

        //     if(didSwap == 0) break;
        // }

        // return arr;

        for(int i = 0; i < arr.length - 1; i++) {
            int didSwap = 0;
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    didSwap = 1;
                }
            }

            if(didSwap == 0) break;
        }

        return arr;
    }

    public static void bubbleSort(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        int[] sortedArr = sortArr(arr);
        printArr(sortedArr);
    }
}
