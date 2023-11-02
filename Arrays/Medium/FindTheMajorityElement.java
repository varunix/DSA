package Arrays.Medium;
//Find the Majority Element that occurs more than N/2 times

import java.util.HashMap;
import java.util.Map;

public class FindTheMajorityElement {
    //Bruteforce approach
    // static void findMajorityElement(int[] nums, int N) {
    //     HashMap<Integer, Integer> hmap = new HashMap<>();
    //     for(int i=0; i<nums.length; i++) {
    //         int value = hmap.getOrDefault(nums[i], 0);
    //         hmap.put(nums[i], value + 1);
    //     }

    //     int max_var = 0;
    //     int max_var_val = 0;
    //     for(Map.Entry<Integer, Integer> map : hmap.entrySet()) {
    //         if(max_var < map.getValue()) {
    //             max_var = map.getKey();
    //             max_var_val = map.getValue();
    //         }
    //     }

    //     if(max_var_val > N/2) {
    //         System.out.println("Majority Element:" + max_var);
    //     } else System.out.println("Majority Element: NULL");
    // }

    //Moore's Voting algorithm (Optimal Approach)
    static void findMajorityElement(int[] nums, int N) {
            if(nums.length < 0) return;
            int count  = 0;
            int elem = nums[0];
            for(int i=0; i<nums.length; i++) {
                if(count == 0) {
                    elem = nums[i];
                    count = 1;
                } else if(nums[i] == elem) {
                    count++;
                } else {
                    count--;
                }
            }

            //verify if current element is majority element
            int max_count = 0;
            for(int i=0; i<nums.length; i++) {
                if(elem == nums[i]) {
                    max_count++;
                }
            }

            if(max_count > N/2) System.out.println("Majority Element:" + elem);
            else System.out.println("Majority Element: NULL");
        }

    public static void findTheMajorityElement() {
        int N = 7; 
        int[] nums = {2,2,1,1,1,2,2};
        findMajorityElement(nums, N);
    }
}