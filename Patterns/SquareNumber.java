package Patterns;

public class SquareNumber {
    public static void printSquareNumber(int n) {
        for(int i = 0; i < 2*n - 1; i++) {
            for(int j = 0; j < 2*n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int bottom = (2*n-2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }

            System.out.println();
        }
    }
}

// Output:
// 555555555
// 544444445
// 543333345
// 543222345
// 543212345
// 543222345
// 543333345
// 544444445
// 555555555
