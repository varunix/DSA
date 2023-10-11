package Arrays.Easy;

import java.util.Scanner;

public class RotateArrayByKElements {
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

    // static int[] rotate(int[] arr, int k) {
    //     if(arr.length < 2) return arr;
    //     int size = arr.length;
    //     k = k%size;
    //     if(k < 0) k = k+size;
    //     int[] newArr = new int[size];
    //     for(int i=0; i<size; i++) {
    //         newArr[(i+k)%size] = arr[i];
    //     }

    //     return newArr;
    // }

    static void reverse(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] arr, int n, int k) {
        if(arr.length < 2) return;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void rotateArrayByKElements(int n, int k) {
        int[] arr = new int[n];
        inputArr(arr, n);
        // int[] res = rotate(arr, k);

        //OR using Reversal Algorithm
        k = k%n; //if k > n
        if(k < 0) k=k+n;
        rotate(arr, n, k);
        printArr(arr);
    }
}