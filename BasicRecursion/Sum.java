package BasicRecursion;

public class Sum {
    static int printSum(int sum, int count, int n) {
        if(count > n) {
            return sum;
        }

        sum += count;
        return printSum(sum, count+1, n);
    }

    public static void printFirstNaturalNumbers(int n) {
        int sum = 0;
        int count = 1;
        int result = printSum(sum, count, n);
        System.out.println("Sum of first N natural numbers: " + result);
    }
}
