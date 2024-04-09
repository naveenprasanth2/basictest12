package org.example.basics;

import java.util.List;

public class ConvertCharacter {
    public static void main(String[] args) {
        char[] a = {'a', 's', 'l'};
        List<Character> test = new String(a).chars().mapToObj(x -> (char) x).toList();
        System.out.println(test);
    }
}
