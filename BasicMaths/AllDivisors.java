package BasicMaths;

public class AllDivisors {
    public static void printAllDivisors(int n) {
        System.out.print("All Divisors: ");
        // for(int i = 1; i <= n; i++) {
        //     if(n % i == 0) {
        //         System.out.print(i + " ");
        //     }
        // }

        for(int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n%i == 0) {
                System.out.print(i + " ");
                if(n/i != i) {
                    System.out.print(n/i + " ");
                }
            }

        }

        System.out.println();
    }
}

// Output: 1 2 3 4 6 9 12 18 36 or 1 36 2 18 3 12 4 9 6 (here we are printing divisor and quotient)