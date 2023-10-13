package Arrays.Easy;

public class CountMaximumConsecutiveOne {
    static int findConsecutive(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
    public static void countMaximumConsecutiveOne() {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int res = findConsecutive(arr);
        System.out.println("There are " + res + " consecutive 1s in the array");
    }
}
