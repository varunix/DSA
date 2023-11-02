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
        // int max_sum = arr[0];
        // int sum = 0;
        // for(int i=0; i<arr.length; i++) {
        //     sum += arr[i];
        //     max_sum = Math.max(max_sum, sum);
        //     if(sum < 0) {
        //         sum = 0;
        //     }
        // }

        // System.out.println("Maximum Sum:" + max_sum);

        //There might be more than one subarray with the maximum sum. We need to print any of them

        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for(int i=0; i<arr.length; i++) {
            if(sum == 0) start = i;
            sum += arr[i];

            if(sum > max_sum) {
                max_sum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public static void maximumSubarraySum() {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSum(arr);
    }
}
