package Arrays.Medium;

public class SortArrayOfZeroesOnesAndTwos {
    //Bruteforce approach
    // static int[] sortArr(int[] nums) {
    //     int zero=0, one=0, two=0;
    //     for(int i=0; i<nums.length; i++) {
    //         if(nums[i] == 0) {
    //             zero++;
    //         }
    //         if(nums[i] == 1) {
    //             one++;
    //         }
    //         if(nums[i] == 2) {
    //             two++;
    //         }
    //     }

    //     for(int i=0; i<nums.length; i++) {
    //         if(i<zero) {
    //             nums[i] = 0;
    //         }
    //         else if(i<one+zero) {
    //             nums[i] = 1;
    //         }
    //         else
    //             nums[i] = 2;
    //     }
    //     return nums;
    // }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Dutch National Flag Algorithm
    static int[] sortArr(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }
        }

        return nums;
    }

    static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortArrayOfZeroesOnesAndTwos() {
        int[] nums = {2,0,1};
        int[] res = sortArr(nums);
        printArr(res);
    }
}