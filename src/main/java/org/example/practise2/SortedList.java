package org.example.practise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedList {
    private static final List<Integer> list;

    static {
        list = new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 5, 4, 6, 7, 8, 9, 0, 1, 2, 3, 6, 5, 4, 3};
        Arrays.stream(a).boxed().forEach(SortedList::addToSortedList);
        System.out.println(list);
    }

    private static void addToSortedList(int value) {
        int index = Collections.binarySearch(list, value);
        if (index < 0) {
            index = -index - 1;
        }
        list.add(index, value);
    }
}
