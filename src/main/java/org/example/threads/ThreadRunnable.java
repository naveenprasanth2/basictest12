package org.example.threads;

class Hii implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Helloo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ThreadRunnable {
    public static void main(String[] args) {
        Thread hi = Thread.startVirtualThread(new Hii());
        hi.setName("Hi one");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread hello = Thread.startVirtualThread(new Helloo());
        hello.setName("Hello one");
    }
}
