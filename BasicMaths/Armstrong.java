package BasicMaths;

public class Armstrong {
    static int count_Digits(int n) {
        int count = (int) Math.floor(Math.log10(n) + 1);    
        return count;
    }
    public static void printArmstrong(int n) {
        int count = count_Digits(n);
        int origNum = n;
        int sum = 0;
        while(n > 0) {
            int r = n%10;
            sum += Math.pow(r, count);
            n = n/10;
        }

        if(origNum == sum) System.out.println("Yes, it is an Armstrong Number");
        else System.out.println("No, it is not an Armstrong Number");
    }
}

// Output: Yes, it is an Armstrong Number / No, it is not an Armstrong Number
