package org.example.practise3;

import lombok.ToString;

@ToString
public class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
