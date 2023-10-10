package Arrays.Easy;
import java.util.Scanner;

public class ArrayIsSortedCheck {
    static void inputArr(int[] arr, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    static boolean checkIfSorted(int[] arr) {
        if(arr.length < 2) return true;
        boolean incFlag = true;
        boolean decFlag = true;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] >= arr[i]) {
                incFlag = true;
            }
            else {
                incFlag = false;
                break;
            }
        }
        
        if(incFlag == false) {
            for(int i = 0; i < arr.length-1; i++) {
                if(arr[i+1] <= arr[i]) {
                    decFlag = true;
                }
                else {
                    decFlag = false;
                    break;
                }
            }
        } 

        if(decFlag == true || incFlag == true) {
            return true;
        }
        else return false;
    }

    public static void arrayIsSortedCheck (int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        boolean res = checkIfSorted(arr);
        System.out.println(res);
    }
}
