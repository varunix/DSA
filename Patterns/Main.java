package Patterns;

public class Main {
    public static void main(String[] args) {
        FiveStar fiveStar = new FiveStar();
        TriangleStar triangleStar = new TriangleStar();
        int n = 5;
        fiveStar.printStar(n);
        triangleStar.printTriangleStar(n);
    }
}