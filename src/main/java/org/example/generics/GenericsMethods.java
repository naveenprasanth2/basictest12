package org.example.generics;

import java.util.List;

public class GenericsMethods {
    List<?> test;

    public static void main() {
        genericMethod("naveen", "summa");
        genericMethod("summa", 20);
        genericMethod(11, 0);
        printList(List.of(1, 2, 3));
    }

    public static <T, V> void genericMethod(T thing, V otherThing) {
        System.out.println(STR."\{thing}!!!");
        System.out.println(STR."\{otherThing}!!!!");
    }

    public static void printList(List<?> list) {
//        list.add("summa");
//        only read operation is allowed, no other operations
        System.out.println(list);
    }
}
