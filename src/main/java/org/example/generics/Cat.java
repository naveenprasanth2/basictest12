package org.example.generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    public void print() {
        System.out.println("I'm in cat class");
    }
}
