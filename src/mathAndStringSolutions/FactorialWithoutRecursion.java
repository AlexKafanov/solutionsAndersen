package mathAndStringSolutions;

public class FactorialWithoutRecursion {
    public static void main(String[] args) {
        fact(5);
    }

    public static void fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
