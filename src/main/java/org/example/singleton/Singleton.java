package org.example.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private Singleton() {
    }

    public static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
                return singleton;
            }
        } else {
            return singleton;
        }
    }

    @Override
    public Singleton clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Singleton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
