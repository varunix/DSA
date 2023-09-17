package BasicMaths;

public class Palindrome {
    static int reverseInteger(int n) {
        int sum = 0;
        while(n>0) {
            int digit = n%10;
            sum = sum*10 + digit;
            n = n/10;
        }

        return sum;
    }
    public static void printPalindrome(int n) {
       int reverse = reverseInteger(n);
       if(reverse == n) System.out.println("Palindrome Number");
       else System.out.println("Not a Palindrome Number");
    }
}

// Output: Palindrome Number/Not a Palindrome Number