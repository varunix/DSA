package Patterns;

public class TriangleNumberSecond {
    public static void printTriangleNumberSecond(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// 1
// 22
// 333
// 4444
// 55555