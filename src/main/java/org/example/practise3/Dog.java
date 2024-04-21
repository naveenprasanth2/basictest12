package org.example.practise3;

public class Dog extends Animal {
    public final String name = "Dog";
    @Override
    public void makeNoise() {
        System.out.println("Woof Woof!");
    }

    public void growl() {
        System.out.println("Grrrr");
    }
}
