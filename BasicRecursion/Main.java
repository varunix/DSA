package BasicRecursion;

public class Main {
    public static void main(String args[]) {
        Count count = new Count();
        Sum sum = new Sum();
        Factorial factorial = new Factorial();
        count.printNTimes(5);
        sum.printFirstNaturalNumbers(5);
        factorial.printFactorialOfNumber(5);
    }
}
