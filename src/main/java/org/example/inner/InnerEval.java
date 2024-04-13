package org.example.inner;

public class InnerEval {
    public static void main(String[] args) {
        Animal animal = new Animal(6);
        System.out.println(animal.num);
        Animal.Elephant elephant = new Animal.Elephant(5);
//        Animal.Elephant elephant = animal.new Elephant(0);
        System.out.println(elephant.num);
//
//        Animal.Elephant elephant1 = animal.new Elephant(9);
//        System.out.println(elephant1.num);
    }
}
