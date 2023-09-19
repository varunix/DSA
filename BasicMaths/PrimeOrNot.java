package BasicMaths;

public class PrimeOrNot {
    public static void printPrimeOrNot(int n) {
        boolean flag = true;
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if((n%i == 0)) {
                flag = false;
            }
        }

        if(flag == true) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}

// Output: Prime or Not Prime