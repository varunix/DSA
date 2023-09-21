package BasicRecursion;

public class Factorial {
    static int factorial(int n) {
        if(n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void printFactorialOfNumber(int n) {
        int result = factorial(n);
        System.out.println("Factorial of "+ n + " : " + result);
    }
}
