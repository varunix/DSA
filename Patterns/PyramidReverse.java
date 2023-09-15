package Patterns;

public class PyramidReverse {
    public static void printReversePyramid(int n) {
        // for(int i = n; i > 0; i--) {
        //     //space
        //     for(int j = 0; j < n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     //star
        //     for(int j = 0; j < (2*i-1); j++) {
        //         System.out.print("*");
        //     }

        //     //space
        //     for(int j = 0; j < n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     System.out.println();
        // }

        // System.out.println();

        for(int i = 0; i < n; i++) {
            //space
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //star
            for(int j = 0; j < 2*n - (2*i+1); j++) {
                System.out.print("*");
            }

            //space
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// *********
//  *******
//   *****
//    ***
//     *
