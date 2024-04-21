package org.example.practise3;

public class Casting {
    public static void main(String[] args) {
        Animal animal = new Dog();
//        System.out.println(animal.name);
//        animal.makeNoise();
//        animal.growl(); this won't work as object is of type animal and not dog
        doAnimalStuff(animal);
        doAnimalStuff(new Cat());
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        if (animal instanceof Dog dog) {
            dog.growl();
        }
    }
}
