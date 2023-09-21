package BasicRecursion;

public class Main {
    public static void main(String args[]) {
        Count count = new Count();
        Sum sum = new Sum();
        Factorial factorial = new Factorial();
        ReverseArray reverseArray = new ReverseArray();
        Palindrome palindrome = new Palindrome();
        count.printNTimes(5);
        sum.printFirstNaturalNumbers(5);
        factorial.printFactorialOfNumber(5);
        // reverseArray.printReverseArray(5);
        palindrome.printPalindrome("abcdcba");
    }
}
