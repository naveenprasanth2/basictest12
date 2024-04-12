package org.example.basics;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
