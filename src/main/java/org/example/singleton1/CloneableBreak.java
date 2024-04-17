package org.example.singleton1;

public class CloneableBreak {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = singleton.clone();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton.hashCode());
    }
}
