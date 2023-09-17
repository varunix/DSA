package BasicMaths;

public class ReverseInteger {
    public static void reverse_Integer(int n) {
        long sum = 0;
        while(n != 0) {
            int digit = n%10;
            sum = sum*10 + digit;
            n = n/10;
        }

        if(sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) System.out.println(0);
        else System.out.println("Reverse Integer: " + (int)sum);
    }
}

// Output: -321

