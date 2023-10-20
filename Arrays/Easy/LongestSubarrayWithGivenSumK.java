package Arrays.Easy;

import java.util.HashMap;

public class LongestSubarrayWithGivenSumK {
    static int findSum(int[] arr, int N, int k) {
        //Better approach (Hashing) for +ves and optimal approach for -ves
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

            //condition added to cover negatives and zeroes in array
            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;

        //Optimal approach (2 pointers) only for +ves
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
        int N = 3, k = 1;
        int[] arr = {-1, 1, 1};
        int res = findSum(arr, N, k);
        System.out.println(res);
    }
}
