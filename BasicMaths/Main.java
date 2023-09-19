package BasicMaths;

public class Main {
    public static void main(String args[]) {
        CountDigits countDigits = new CountDigits();
        ReverseInteger reverseInteger = new ReverseInteger();
        Palindrome palindrome = new Palindrome();
        AllDivisors allDivisors = new AllDivisors();
        Gcd gcd = new Gcd();
        Armstrong armstrong = new Armstrong();
        countDigits.count_Digits(12345);
        reverseInteger.reverse_Integer(-123);
        palindrome.printPalindrome(-121);
        allDivisors.printAllDivisors(36);
        gcd.printGcd( 12, 33);
        armstrong.printArmstrong(153);
    }
}
