package org.example.generics;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    public void print() {
        System.out.println("I'm in dog class");
    }
}
