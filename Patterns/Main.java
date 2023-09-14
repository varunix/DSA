package Patterns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        FiveStar fiveStar = new FiveStar();
        fiveStar.printStar(n);
        System.out.println();
        TriangleStar triangleStar = new TriangleStar();
        triangleStar.printTriangleStar(n);
    }
}