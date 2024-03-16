package org.example.practise;

public class GenerateRandomValue {
    public static void main(String[] args) {
        System.out.println(generateRandom(550, 600));
        System.out.println(generateRandom(1000, 1020));
    }

    private static long generateRandom(int min, int max) {
        int diff = (max - min) + 1;
        return ((System.currentTimeMillis() % diff) + min);
    }
}
