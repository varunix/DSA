package Patterns;

public class Main {
    public static void main(String[] args) {
        FiveStar fiveStar = new FiveStar();
        TriangleStar triangleStar = new TriangleStar();
        TriangleNumber triangleNumber = new TriangleNumber();
        TriangleNumberSecond triangleNumberSecond = new TriangleNumberSecond();
        TriangleStarSecond triangleStarSecond = new TriangleStarSecond();
        TriangleNumberThird triangleNumberThird = new TriangleNumberThird();
        Pyramid pyramid = new Pyramid();
        PyramidReverse reversePyramid = new PyramidReverse();
        PyramidDiamond pyramidDiamond = new PyramidDiamond();
        PyramidDiamondSecond pyramidDiamondSecond = new PyramidDiamondSecond();
        int n = 5;
        fiveStar.printStar(n);
        triangleStar.printTriangleStar(n);
        triangleNumber.printTriangleNumber(n);
        triangleNumberSecond.printTriangleNumberSecond(n);
        triangleStarSecond.printTriangleStarSecond(n);
        triangleNumberThird.printTriangleNumberThird(n);
        pyramid.printPyramid(n);
        reversePyramid.printReversePyramid(n);
        pyramidDiamond.printPyramidDiamond(n);
        pyramidDiamondSecond.printPyramidDiamondSecond(n);
    }
}