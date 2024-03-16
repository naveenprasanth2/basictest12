package org.example.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListInsertion {

    private static final List<Integer> list;

    static {
        list = new ArrayList<>();
    }

    public static void main(String[] args) {
        sortedInsertion(1);
        sortedInsertion(5);
        sortedInsertion(2);
        sortedInsertion(-1);
        System.out.println(list);
    }

    private static void sortedInsertion(Integer value) {
        int index = Collections.binarySearch(list, value);
        if(index < 0){
            index = -index - 1;
        }
        list.add(index, value);

    }
}
