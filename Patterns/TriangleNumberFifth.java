package Patterns;

public class TriangleNumberFifth {
    public static void printTriangleNumberFifth(int n) {
        int count = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
