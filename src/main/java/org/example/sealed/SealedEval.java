package org.example.sealed;

public class SealedEval {
    public static void main() {
        Animal animal = new Lion("Singam", "Eat");
        System.out.println(animal.getName());
    }
}
