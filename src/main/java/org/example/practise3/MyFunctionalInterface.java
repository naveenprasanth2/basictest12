package org.example.practise3;

@FunctionalInterface
public interface MyFunctionalInterface {
    int add(int a, int b);

    static int subtract(int a, int b) {
        return a - b;
    }

    default int mapper(int a) {
        return a;
    }
}
