package org.example.practise3;

public interface MyInterface {
    int add(int a, int b);

    int subtract(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }
}
