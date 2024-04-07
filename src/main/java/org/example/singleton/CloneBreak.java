package org.example.singleton;

public class CloneBreak {
    public static void main() {
        Singleton s1 = Singleton.getSingleton();
        System.out.println(s1.hashCode());

        Singleton s2 = s1.clone();
        System.out.println(s2.hashCode());
    }
}
