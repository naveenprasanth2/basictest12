package org.example.practise1;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(25));
        System.out.println(findFactorial(20));
    }

    private static BigInteger findFactorial(int n) {
        return LongStream.rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
