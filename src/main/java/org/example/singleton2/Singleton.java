package org.example.singleton2;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public Singleton clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Singleton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
