package Arrays.Medium;
//Find the Majority Element that occurs more than N/2 times

import java.util.HashMap;
import java.util.Map;

public class FindTheMajorityElement {
    //Bruteforce approach
    static void findMajorityElement(int[] nums, int N) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i])+1);
            }
            else hmap.put(nums[i], 1);
        }

        int max_var = 0;
        int max_var_val = 0;
        for(Map.Entry<Integer, Integer> map : hmap.entrySet()) {
            if(max_var < map.getValue()) {
                max_var = map.getKey();
                max_var_val = map.getValue();
            }
        }

        if(max_var_val > N/2) {
            System.out.println("Majority Element:" + max_var);
        } else System.out.println("Majority Element: NULL");
    }

    public static void findTheMajorityElement() {
        int N = 7; 
        int[] nums = {2,2,1,1,1,2,2};
        findMajorityElement(nums, N);
    }
}