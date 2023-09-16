package Patterns;

public class PyramidDiamondThird {
    public static void printPyramidDiamondSecond(int n) {
        int spaces = 0;
        for(int i = 0; i < n; i++) {
            //stars
            for(int j = 0; j < (n-i); j++) {
                System.out.print("*");
            }

            //spaces
            for(int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 0; j < (n-i); j++) {
                System.out.print("*");
            }

            spaces += 2;
            System.out.println();
        }

        spaces = 2*n - 2;
        for(int i = 1; i <= n; i++) {
            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            spaces -= 2;
            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********