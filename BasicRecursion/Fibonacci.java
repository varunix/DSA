package BasicRecursion;

public class Fibonacci {
    static int fib(int n) {
        if(n <= 1) return n;

        int last = fib(n-1);
        int slast = fib(n-2);
        return last + slast;
    }
    public static void printFibonacci(int n) {
        System.out.println(fib(n));
    }
}