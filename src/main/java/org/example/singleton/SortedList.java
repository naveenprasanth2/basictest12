package org.example.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    private static final List<Integer> finalList;
    static {
        finalList = new ArrayList<>();
    }
    public static void main() {
        List<Integer> numbersToAdd = List.of(8, 3, 5, 12, 2, 7, 10);
        numbersToAdd.forEach(SortedList::sortedAddition);
        System.out.println(finalList);
    }

    public static void sortedAddition(Integer numberToAdd){
        int index = Collections.binarySearch(finalList, numberToAdd);
        if(index < 0){
            index = - index - 1;
        }
        finalList.add(index, numberToAdd);
    }
}
