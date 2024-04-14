package org.example.practise1;

public class RandomGeneration {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(generateRandom(100, 150));
        System.out.println(generateRandom(100, 150));
    }

    private static long generateRandom(long start, long end) throws InterruptedException {
        long seed = System.currentTimeMillis();
        Thread.sleep(10);
        long range = (end - start) + 1;
        return start + (seed % range);
    }
}
