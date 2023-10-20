package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //Bruteforce
    // static void findTwoSum(int[] arr, int n, int t) {
    //     int[] res = {-1,-1};
    //     boolean flag = false;
    //     for(int i=0; i<n-1; i++) {
    //         for(int j=i+1; j<n; j++) {
    //             if((arr[i]+arr[j] == t) && arr[i] != arr[j]) {
    //                 flag = true;
    //                 res[0] = i;
    //                 res[1] = j;
    //             }
    //         }
    //     }

    //     if(flag == true) {
    //         System.out.println("Yes, "+"["+res[0]+","+res[1]+"]");
    //     } else {
    //         System.out.println("No, "+"["+res[0]+","+res[1]+"]");
    //     }
    // }

    //Hashing
    // static void findTwoSum(int[] arr, int n, int t) {
    //     boolean flag = false;
    //     int[] res = {-1, -1};
    //     HashMap<Integer, Integer> hmap = new HashMap<>();
    //     for(int i=0; i<n; i++) {
    //         int num = arr[i];
    //         int moreNeeded = t - num;
    //         if(hmap.containsKey(moreNeeded)) {
    //             flag = true;
    //             res[0] = hmap.get(moreNeeded);
    //             res[1] = i;
    //         }

    //         hmap.put(arr[i], i);
    //     }

    //     if(flag == true) {
    //         System.out.println("Yes, "+"["+res[0]+","+res[1]+"]");
    //     } else {
    //         System.out.println("No, "+"["+res[0]+","+res[1]+"]");
    //     }
    // }

    //2 pointer
    static void findTwoSum(int[] arr, int n, int t) {
        boolean flag = false;
        int i=0;
        int j=n-1;
        Arrays.sort(arr);
        while(i < j) {
            int sum = arr[i]+arr[j];
            if(sum == t) {
                flag = true;
                break;
            } else if(sum < t) {
                i++;
            } else {
                j--;
            }
        }

        if(flag == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void twoSum() {
        int N = 5;
        int[] arr = {2,6,5,8,11};
        int target = 14;
        findTwoSum(arr, N, target);
    }
}
