package Sorting;

import java.util.Scanner;

public class MergeSort {
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

    static void mergeArr(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int left = low;
        int right = mid+1;
        int i = 0;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[i] = arr[left];
                left++;
                i++;
            } else {
                temp[i] = arr[right];
                right++;
                i++;
            }
        }

        while(left <= mid) {
            temp[i] = arr[left];
            left++;
            i++;
        }

        while(right <= high) {
            temp[i] = arr[right];
            right++;
            i++;
        }

        for(int j = low; j <= high; j++) {
            arr[j] = temp[j - low];
        }
    }

    static void sortArr(int[] arr, int low, int high) {
        if(low == high) {
            return;
        }
        
        int mid = (low+high)/2;
        sortArr(arr, low, mid);
        sortArr(arr, mid+1, high);
        mergeArr(arr, low, mid, high);
    }

    public static void mergeSort(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        int low = 0;
        int high = arr.length-1;
        sortArr(arr, low, high);
        printArr(arr);
    }
}
