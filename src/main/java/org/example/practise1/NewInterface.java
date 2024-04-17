package org.example.practise1;

@FunctionalInterface
public interface NewInterface {
    void summa();

    boolean equals(Object obj);

    static void staticMethod() {
        System.out.println("its static method");
    }

    default void defaultMethod(){
        System.out.println("Its default");
    }
}
