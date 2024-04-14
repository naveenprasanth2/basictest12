package org.example.threads;

import java.util.stream.IntStream;

public class MultiThreadEval {
    public static void main() {
        IntStream.rangeClosed(1, 5).forEach(threadNumber -> {
            MultiThread multiThread = new MultiThread(threadNumber);
            multiThread.start();
        });
        throw new RuntimeException("main thread failed");
    }
}
