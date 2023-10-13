package Arrays.Easy;

public class NumberThatAppearsOnce {
    static int checkAppearance(int[] arr) {
        int xor = 0;
        for(int i=0; i<arr.length; i++) {
            xor = xor^arr[i];
        }

        return xor;
    }

    static void numberThatAppearsOnce() {
        int[] arr = {4,1,2,1,2};
        int res = checkAppearance(arr);
        System.out.println(res);
    }
}
