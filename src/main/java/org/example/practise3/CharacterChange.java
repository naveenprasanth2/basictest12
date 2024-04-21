package org.example.practise3;

public class CharacterChange {
    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c'};

        new String(c).chars().mapToObj(i -> (char)++i).forEach(System.out::println);
        for (char x : c) {
            System.out.println((++x));
        }
    }
}
