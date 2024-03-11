package org.example.streams;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(findFibonacci(20));
    }

    public static int findFibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return findFibonacci(number - 1) + findFibonacci(number - 2);
        }
    }
}
