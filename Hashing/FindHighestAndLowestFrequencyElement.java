package Hashing;

import java.util.HashMap;

public class FindHighestAndLowestFrequencyElement {
    static void findHighestAndLowest(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap();
        for(int i=0; i<arr.length; i++) {
            if(hmap.containsKey(arr[i])) {
                hmap.put(arr[i], hmap.get(arr[i])+1);
            } else {
                hmap.put(arr[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int maxKey = 0;
        int lowest = Integer.MAX_VALUE;
        int lowKey = 0;
        for(Integer itr: hmap.keySet()) {
            if(hmap.get(itr) >= max) {
                max = hmap.get(itr);
                maxKey = itr;
            }

            if(hmap.get(itr) <= lowest) {
                lowest = hmap.get(itr);
                lowKey = itr;
            }
        }

        System.out.println("Higest:"+ maxKey + " Lowest:"+lowKey);

    }
    public static void findHighestAndLowestFreqElement() {
        int[] arr = {2,2,3,4,4,2};
        findHighestAndLowest(arr);
    }
}