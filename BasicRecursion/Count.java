package BasicRecursion;

public class Count {
    static void printCounts(int i, int n) {
        //return type is int here
        // if(i > n) {
        //     return i;
        // }

        // System.out.print(i + " ");
        // i++;
        // return printCounts(i, n);

        //using backtracking, return type is void
        if(i < 0) {
            return;
        }
        printCounts(i-1, n);
        System.out.print(i + " ");
    }

    public static void printNTimes(int n) {
        int i = 5;
        System.out.print("Counts: ");
        printCounts(i, n);
        System.out.println();
    }
}

// Output: 0 1 2 3 4 5