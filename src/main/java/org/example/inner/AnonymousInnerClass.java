package org.example.inner;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal animal = new Animal(9);
        animal.shout();
        Animal newAnimal = new Animal(10){
            @Override
            public void shout() {
                System.out.println("this is inside anonymous");
            }
        };
        newAnimal.shout();
        Animal newAnimal1 = new Animal(10){
            @Override
            public void shout() {
                System.out.println("this is inside anonymous1");
            }
        };
        newAnimal1.shout();
    }
}
