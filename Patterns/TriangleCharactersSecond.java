package Patterns;

public class TriangleCharactersSecond {
    public static void printTriangleCharactersSecond(int n) {
        // for(int i = n; i >= 0; i--) {
        //     for(char ch = 'A'; ch < 'A'+ i; ch++) {
        //         System.out.print(ch);
        //     }

        //     System.out.println();
        // }

        // System.out.println();

        for(int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <= 'A' + (n-i-1); ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// ABCDE
// ABCD
// ABC
// AB
// A