package org.example.annotations;

public record Dog(String name) {
    void meow() {
        System.out.println("Bark");
    }

    void eat() {
        System.out.println("Dog food");
    }
}
