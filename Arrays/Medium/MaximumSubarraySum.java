package Arrays.Medium;

public class MaximumSubarraySum {
    //Bruteforce
    // static void maxSum(int[] arr) {
    //     int max_sum = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++) {
    //         int sum = 0;
    //         for(int j=i; j<arr.length; j++) {
    //             sum += arr[j];
    //             max_sum = Math.max(max_sum, sum);
    //         }
    //     }

    //     System.out.println("Maximum sum:" + max_sum);
    // }

    //Using Kadane's Algorithm
    static void maxSum(int[] arr) {
        int max_sum = arr[0];
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(sum < 0) {
                sum = 0;
            } else max_sum = Math.max(max_sum, sum);
        }

        System.out.println("Maximum sum:" + max_sum);
    }

    public static void maximumSubarraySum() {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSum(arr);
    }
}
