package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestAndSecondSmallestElement {
    static void inputArr(int[] arr, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    static int findSecondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE; //Minimum integer value
        int secondLargest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(secondLargest < arr[i] && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    static int findSecondSmallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE; //Maximum integer value
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(smallest > arr[i]) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(secondSmallest > arr[i] && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static void secondLargestAndSecondSmallestElement (int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        if(arr.length < 2) {
            System.out.println("-1");
            return;
        }
        
        int secondLargestelement = findSecondLargestElement(arr);
        int secondSmallestelement = findSecondSmallestElement(arr);
        System.out.println("Second largest element: " + secondLargestelement);
        System.out.println("Second smallest element: " + secondSmallestelement);
    }
}
