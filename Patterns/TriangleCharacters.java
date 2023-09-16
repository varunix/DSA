package Patterns;

public class TriangleCharacters {
    public static void printTriangleCharacters(int n) {
        // for(int i = 1; i <= n; i++) {
        //     int character = 65;
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print((char)character);
        //         character++;
        //     }

        //     System.out.println();
        // }

        // System.out.println();

        for(int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// A
// AB
// ABC
// ABCD
// ABCDE