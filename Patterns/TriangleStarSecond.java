package Patterns;

public class TriangleStarSecond {
    public static void printTriangleStarSecond(int n) {
        // int k = n;
        // for(int i = 0; i < n; i++) {
        //     for(int j = k; j > 0; j--) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        //     k--;
        // }

        // System.out.println();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
