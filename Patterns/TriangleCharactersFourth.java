package Patterns;

public class TriangleCharactersFourth {
    public static void printTriangleCharactersFourth(int n) {
        for(int i = 0; i < n; i++) {
            for(char ch = (char)('E'-i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// E
// D E
// C D E
// B C D E
// A B C D E
