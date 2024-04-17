package org.example.annotations;

@VeryImportant
public record Cat(String name) {
    @RunImmediately
    void meow() {
        System.out.println("Meow");
    }

    void eat() {
        System.out.println("Munch");
    }
}
