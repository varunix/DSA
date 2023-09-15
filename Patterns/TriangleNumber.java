package Patterns;

public class TriangleNumber {
    public static void printTriangleNumber(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();
    }
}
