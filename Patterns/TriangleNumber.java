package Patterns;

public class TriangleNumber {
    public static void printTriangleNumber(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// 1
// 12
// 123
// 1234
// 12345