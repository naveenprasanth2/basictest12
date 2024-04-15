package org.example.practise1;

public class AnonymousClass {
    public static void main() {
        Runnable runnable = () -> System.out.println("test");
        runnable.run();
    }
}
