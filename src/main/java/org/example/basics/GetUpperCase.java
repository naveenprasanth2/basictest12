package org.example.basics;

import java.util.stream.Stream;

public class GetUpperCase {
    public static void main(String[] args) {
        String a = "naveen is a A good? boy--boy ?testing \\--- test]pannitu iruken pa test8956 -summaa summa" +
                " summa-summa summa- test-panni Paathenhu -a GJHGU HGSYG GUYGS JHGSUYFJYf GHJG VG BBl LL KK HGHGH KKllll hhLLL";

        String characters = new String(a.replaceAll("\\s", "").toCharArray());
        characters.chars()
                .mapToObj(x -> (char) x)
                .filter(Character::isUpperCase)
                .forEach(System.out::print);
        System.out.println();
        characters.chars()
                .mapToObj(x -> (char) x)
                .filter(x -> x >= 65 && x <= 90)
                .forEach(System.out::print);
    }
}
