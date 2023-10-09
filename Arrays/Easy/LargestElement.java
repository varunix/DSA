package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    static void inputArr(int[] arr, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    static int findLargestElement(int[] arr) {
        int max = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] >= max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int findLargestElementUsingRecursion(int[] arr, int max, int startIndex) {
        if(startIndex > arr.length-1) {
            return max;
        }

        if(arr[startIndex] >= max) max = arr[startIndex];
        return findLargestElementUsingRecursion(arr, max, startIndex+1); 
    }

    public static void largestElement(int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        //Bruteforce approach
        // int res = findLargestElement(arr);

        // 2nd Bruteforce approach
        // Arrays.sort(arr); 
        // System.out.println(arr[arr.length - 1]);

        //Recursive approach
        int res = findLargestElementUsingRecursion(arr, 0, 0);
        System.out.println(res);
    }
}
