package mathAndStringSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        fib(n);
    }

    public static void fib(int n) {
        int[] fib = new int[n];
        if (n != 0) {
            if (n == 1)
                System.out.println(0);
            else {
                fib[0] = 0;
                fib[1] = 1;
                for (int i = 2; i < n; i++) {
                    fib[i] = fib[i - 1] + fib[i - 2];
                }
                Arrays.stream(fib).forEach(System.out::println);
            }
        } else {
            System.err.println("Number must be > 0");
        }
    }
}
