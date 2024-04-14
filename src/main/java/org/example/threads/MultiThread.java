package org.example.threads;

import lombok.AllArgsConstructor;

import java.util.stream.IntStream;

@AllArgsConstructor
public class MultiThread extends Thread {
    int threadNumber;

    @Override
    public void run() {
        IntStream.rangeClosed(0, 5).forEach(x -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (threadNumber == 3){
                throw new RuntimeException("This is thread 3");
            }
            System.out.println(STR."the value is \{x} and the thread number is \{threadNumber}");
        });
    }

}
