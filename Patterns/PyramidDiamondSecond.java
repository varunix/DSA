package Patterns;

public class PyramidDiamondSecond {
    public static void printPyramidDiamondSecond(int n) {
        for(int i = 1; i <= 2*n - 1; i++) {
            int start = i;
            if (i > n) start = 2*n-i;
            for(int j = 1; j <= start; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
