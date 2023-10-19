package Arrays.Easy;

import java.util.HashMap;

public class LongestSubarrayWithGivenSumKPositives {
    static int findSum(int[] arr, int N, int k) {
        //Better Approach (Hashing)
        int maxLen = 0;
        long sum = 0;
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        
        for(int i=0; i<N; i++) {
            sum += arr[i];

            if(sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }

            long rem = sum - k;
            
            if(preSumMap.containsKey(rem)) {
                int len  = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;

        //Optimal Approach (2 pointers)
        // int maxLen = 0;
        // long sum = arr[0];
        // int left = 0, right = 0;
        // while(right < N) {
        //     while(left <= right && sum > k) {
        //         sum -= arr[left];
        //         left++;
        //     }

        //     if(sum == k) {
        //         maxLen = Math.max(maxLen, right-left+1);
        //     }

        //     right++;
        //     if(right < N) sum += arr[right];
        // }

        // return maxLen;
    }

    static void longestSubarray() {
        int N = 5, k = 10;
        int[] arr = {2,3,5,1,9};
        int res = findSum(arr, N, k);
        System.out.println(res);
    }
}
