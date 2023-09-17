package BasicMaths;

public class CountDigits {
    public static void count_Digits(int n) {
        // int count = 0;
        // while (n != 0) {
        //     n = n / 10;
        //     count++;
        // }

        int count = (int) Math.floor(Math.log10(n) + 1);    
        System.out.println("Number of counts: " + count);
    }
}

// Output: 5