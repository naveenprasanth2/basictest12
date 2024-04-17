package org.example.singleton1;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Singleton implements Serializable {
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
}
