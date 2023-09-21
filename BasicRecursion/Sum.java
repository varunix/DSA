package BasicRecursion;

public class Sum {
    // static int printSum(int sum, int count, int n) {
    //     if(count > n) {
    //         return sum;
    //     }

    //     sum += count;
    //     return printSum(sum, count+1, n);
    // }

    static int printSum(int n) {
        if(n == 0) {
            return 0;
        }

        return n + printSum(n-1);
    }

    public static void printFirstNaturalNumbers(int n) {
        int sum = 0;
        int count = 1;
        // int result = printSum(sum, count, n); //using parameterised recursion
        int result = printSum(n); //using  //using functional recursion
        System.out.println("Sum of first N natural numbers: " + result);
    }
}
