package org.example.practise2;

public class GenerateRandom {
    public static void main(String[] args) {
        System.out.println(generateRandom(System.currentTimeMillis(), 100, 150));
    }

    private static long generateRandom(long seed, int start, int end) {
        int range = (end - start) + 1;
        long finalVal = seed%range;
        return start+finalVal;
    }
}
