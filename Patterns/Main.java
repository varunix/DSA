package Patterns;

public class Main {
    public static void main(String[] args) {
        FiveStar fiveStar = new FiveStar();
        TriangleStar triangleStar = new TriangleStar();
        TriangleNumber triangleNumber = new TriangleNumber();
        TriangleNumberSecond triangleNumberSecond = new TriangleNumberSecond();
        TriangleStarSecond triangleStarSecond = new TriangleStarSecond();
        TriangleNumberThird triangleNumberThird = new TriangleNumberThird();
        int n = 5;
        fiveStar.printStar(n);
        triangleStar.printTriangleStar(n);
        triangleNumber.printTriangleNumber(n);
        triangleNumberSecond.printTriangleNumberSecond(n);
        triangleStarSecond.printTriangleStarSecond(n);
        triangleNumberThird.printTriangleNumberThird(n);
    }
}