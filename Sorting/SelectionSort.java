package Sorting;

import java.util.Scanner;

public class SelectionSort {
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

    static int[] sortArr(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i; j < arr.length; j++) {
                int min = arr[i];
                if(min > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }

        return arr;
    }
    
    public static void selectionSort(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        int[] sortedArr = sortArr(arr);
        printArr(sortedArr);
    }
}
