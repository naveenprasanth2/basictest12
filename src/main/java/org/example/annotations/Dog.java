package org.example.annotations;

import lombok.Builder;

@Builder
public record Dog(String name) implements Cloneable {
    void meow() {
        System.out.println("Bark");
    }

    void eat() {
        System.out.println("Dog food");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
