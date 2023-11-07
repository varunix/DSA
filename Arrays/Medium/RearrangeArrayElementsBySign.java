package Arrays.Medium;

import java.util.ArrayList;

public class RearrangeArrayElementsBySign {
    //In O(2N)
    // static int[] reArrange(int[] arr, int n) {
    //     ArrayList<Integer> pos = new ArrayList<Integer>();
    //     ArrayList<Integer> neg = new ArrayList<Integer>();

    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] < 0) {
    //             neg.add(arr[i]);
    //         } else pos.add(arr[i]);
    //     }

    //     for(int i=0; i<n/2; i++) {
    //         arr[2*i] = pos.get(i);
    //         arr[2*i+1] = neg.get(i);
    //     }

    //     return arr;
    // }

    //In O(N)
    static int[] reArrange(int[] arr, int n) {
        int[] ans = new int[n];
        int pos=0, neg=1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= 0) {
                ans[pos] = arr[i];
                pos+=2;
            } else {
                ans[neg] = arr[i];
                neg+=2;
            }
        }

        return ans;
    }

    static void rearrangeArrayElementsBySign() {
        int N = 4;
        int A[] = {1, 2, -4, -5};

        int[] ans = reArrange(A, N);

        System.out.println("Rearranged Array:");
        for(int i: ans) {
            System.out.print(i+" ");
        }
    }
}