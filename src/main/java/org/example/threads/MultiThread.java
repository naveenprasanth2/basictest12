package org.example.threads;

import java.util.stream.IntStream;

public class MultiThread extends Thread{
    @Override
    public void run() {
        IntStream.rangeClosed(0, 5).forEach(x -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(x);
        });
    }

}
