package Patterns;

public class PyramidNumber {
    public static void printPyramidNumber(int n) {
        for(int i = 1; i <= n; i++) {
            //Numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            //Spaces
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            //Numbers
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321