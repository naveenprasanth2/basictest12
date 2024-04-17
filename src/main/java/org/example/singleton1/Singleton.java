package org.example.singleton1;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Singleton implements Serializable, Cloneable {
    private static volatile Singleton singleton;
    private String name;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
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
