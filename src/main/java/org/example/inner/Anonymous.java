package org.example.inner;


public class Anonymous {
    public static void main() {
        Animal animal = new Animal(10) {
            @Override
            public void shout() {
                System.out.println("this is anonymous class");
            }
        };
        animal.shout();

        Runnable runnable = () -> System.out.println("inside run");
        runnable.run();
    }
}
