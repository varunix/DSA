package Patterns;

public class TriangleNumberThird {
    public static void printTriangleNumberThird(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();
    }
}
