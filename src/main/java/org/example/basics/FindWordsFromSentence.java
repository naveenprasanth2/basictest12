package org.example.basics;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FindWordsFromSentence {
    public static void main(String[] args) {
        String a = "naveen is a A good? boy--boy ?testing \\--- test]pannitu iruken pa test8956 -summaa summa" +
                " summa-summa summa- test-panni Paathenhu -a GJHGU HGSYG GUYGS JHGSUYFJYf GHJG VG BBl LL KK HGHGH KKllll hhLLL";

        List<String> test = Stream.of(a.split(" ")).toList();

        test.stream().filter(x -> Pattern.matches("[a-zA-Z]+|[a-zA-Z]+-[a-zA-Z]+", x))
                .forEach(System.out::println);

    }
}
