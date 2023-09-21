package BasicRecursion;

public class Palindrome {
    static boolean checkPalindrome(int i, String s) {
        if(i >= s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        
        return checkPalindrome(i+1, s);
    }
    static void printPalindrome(String str) {
        boolean flag = checkPalindrome(0, str);
        if (flag) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}