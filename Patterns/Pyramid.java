package Patterns;

public class Pyramid {
    public static void printPyramid(int n) {
        for(int i = 0; i < n; i++) {
            //space
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            //star
            for(int j = 0; j < 2*i + 1; j++) {
                System.out.print("*");
            }
            
            //space
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
//     *
//    ***
//   *****
//  *******
// *********
