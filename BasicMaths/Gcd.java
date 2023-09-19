package BasicMaths;

public class Gcd {
    // public static void printGcd(int d, int q) {
    //     while(q%d != 0) {
    //         int r = q%d;
    //         q = d;
    //         d = r;
    //     }

    //     System.out.print("GCD: " + d);
    // }

    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static void printGcd(int a, int b) {
        if(a < b) {
            int swap = a;
            a = b;
            b = swap;
        }

        int gcd = gcd(a, b);
        System.out.println("GCD: " + gcd);
    }
}

// Output: GCD: 20
