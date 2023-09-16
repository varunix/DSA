package Patterns;

public class TriangleNumberFourth {
    public static void printTriangleNumberFourth(int n) {
        int num = 1;
        for(int i = 0; i < n; i++) {
            if (i % 2 == 0) num = 0;
            else num = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(num);
                num = 1 - num;
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// 0
// 10
// 010
// 1010
// 01010
