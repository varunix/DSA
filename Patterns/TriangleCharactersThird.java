package Patterns;

public class TriangleCharactersThird {
    public static void printTriangleCharactersSecond(int n) {
        for(int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for(int j = 0; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        System.out.println();
    }
}

// Output:
// A
// BB
// CCC
// DDDD
// EEEEE