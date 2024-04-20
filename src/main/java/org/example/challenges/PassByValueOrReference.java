package org.example.challenges;

public class PassByValueOrReference {
    public static void main(String[] args) {
        Cheese myCheese = new Cheese();
        myCheese.setLevelOfStink(10);
        System.out.println(myCheese.getLevelOfStink());
        increaseStink(myCheese);
        System.out.println(myCheese.getLevelOfStink());
    }

    private static void increaseStink(Cheese cheese) {
        cheese.setLevelOfStink(cheese.getLevelOfStink() + 1);
    }
}
