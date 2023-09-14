package Patterns;
import java.util.*;

public class FiveStar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;
        int j = 0;
        printStar(n, i, j);
    }

    public static void printStar (int n, int i, int j) {
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// Output:
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 