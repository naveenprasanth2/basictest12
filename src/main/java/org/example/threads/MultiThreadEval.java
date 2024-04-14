package org.example.threads;

import java.util.stream.IntStream;

public class MultiThreadEval {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5).forEach(_ -> {
            MultiThread multiThread = new MultiThread();
            multiThread.start();
        });
    }
}
