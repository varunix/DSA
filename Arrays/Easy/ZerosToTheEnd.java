package Arrays.Easy;

import java.util.Scanner;

public class ZerosToTheEnd {
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
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void moveZeros(int[] arr) {
        int j = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[j] == 0) {
                if(i>j && arr[i] != 0) {
                    swap(arr, i, j);
                    j++;
                }
            } else j++;
        }
    }

    public static void zerosToTheEnd (int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        moveZeros(arr);
        printArr(arr);
    }
}
