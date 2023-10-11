package Arrays.Easy;

import java.util.Scanner;

public class RemoveDuplicates {
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

    static int[] removeDuplicate(int[] arr) {
        if(arr.length < 2) {
            return arr;
        }
        int j = 0;
        int count = 0;
        int[] newArr = new int[arr.length];
        for(int i = 1; i<=arr.length-1; i++) {
            if(arr[i-1] == arr[i]) count++;
            if(arr[i-1] != arr[i] && count < 2) count = 0; newArr[j] = arr[i-1]; j++;
        }

        return newArr;
    }

    public static void removeDuplicates (int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        int[] res = removeDuplicate(arr);
        printArr(res);
    }
}
