package Arrays.Easy;
import java.util.Scanner;

public class FindMissingNumberXOR {
    static void inputArr(int[] arr, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    static int missingNumber(int[] arr, int N) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0; i<N-1; i++) {
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }

        xor1 = xor1^N;
        return xor1^xor2;
    }

    public static void findMissingNumberXOR(int N, int n) {
        int[] arr = new int[n];
        inputArr(arr, n);
        int res = missingNumber(arr, N);
        System.out.println("Missing Number: " + res);
    }
}
