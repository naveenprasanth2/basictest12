package org.example.generics;

public class AnimalEval {
    public static void main() {
        AnimalImplementation<Cat> animalImplementation = new AnimalImplementation<>(new Cat());
        animalImplementation.test();
        AnimalImplementation<Dog> animalImplementation1 = new AnimalImplementation<>(new Dog());
        animalImplementation1.test();
    }
}
