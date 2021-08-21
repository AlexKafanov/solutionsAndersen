package mathAndStringSolutions;

public class FactorialRecursion {
    public static void main(String[] args) {
        int fact = factorialRecursion(4);
        System.out.println(fact);
    }

    public static int factorialRecursion(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorialRecursion(n - 1));
    }
}
