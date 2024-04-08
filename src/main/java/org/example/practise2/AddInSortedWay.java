package org.example.practise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddInSortedWay {
    private static List<Integer> finalList;
    static {
        finalList = new ArrayList<>();
    }
    public static void main(String[] args) {
        List<Integer> test = List.of(1, 3, 4, 2, 3, 2, 1, 8, 9, 6, 54, 3);
        test.forEach(AddInSortedWay::addToSortedList);
        System.out.println(finalList);
    }

    private static void addToSortedList(int number){
        int index = Collections.binarySearch(finalList, number);
        if(index < 0){
            index = -index-1;
        }
        finalList.add(index, number);
    }
}
