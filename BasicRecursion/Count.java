package BasicRecursion;

public class Count {
    static int printCounts(int i, int n) {
        if(i == n + 1) {
            return i;
        }

        System.out.print(i + " ");
        i++;
        return printCounts(i, n);
    }

    public static void printNTimes(int n) {
        int i = 0;
        printCounts(i, n);
    }
}

// Output: 0 1 2 3 4 5