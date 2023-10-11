package Arrays.Easy;

import java.util.Scanner;

public class LeftRotateArrayByOne {
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

    static void rotate(int[] arr) {
        if(arr.length < 2) return;
        int temp = arr[0];
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;
    }

    public static void leftRotate(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        rotate(arr);
        printArr(arr);
    }
}