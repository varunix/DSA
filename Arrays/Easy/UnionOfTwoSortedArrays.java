package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class UnionOfTwoSortedArrays {
    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> union = new ArrayList<>();
        for(int i=0; i<arr1.length; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0)+1);
        }

        for(int j=0; j<arr2.length; j++) {
            freq.put(arr2[j], freq.getOrDefault(arr2[j], 0)+1);
        }

        for(int i: freq.keySet()) {
            union.add(i);
        }

        return union;
    }

    public static void unionOfTwoSortedArrays() {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        ArrayList<Integer> Union = findUnion(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for(int i: Union) {
            System.out.print(i + " ");
        }
    }
}
