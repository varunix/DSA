package Patterns;

class TriangleStar {
    public static void printTriangleStar(int n) {
        int str = 1;
        int sp = n-1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= str; j++) {
                System.out.print("* ");
            }

            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            str++;
            sp--;
            System.out.println();
        }
    }
}

// Output:
// *
// * *
// * * *
// * * * *
// * * * * *