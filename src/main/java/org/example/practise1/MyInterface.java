package org.example.practise1;

public interface MyInterface {
    void summa();

    void test(String value1, String value2);

    default void testing() {
        System.out.println("testing");
    }
}
