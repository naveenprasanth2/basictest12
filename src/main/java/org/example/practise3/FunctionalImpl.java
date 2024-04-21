package org.example.practise3;

import java.util.stream.IntStream;

public class FunctionalImpl {
    public static void main() {
        MyFunctionalInterface myFunctionalInterface = Integer::sum;
        System.out.println(myFunctionalInterface.add(1, 5));
        int testVal = IntStream.rangeClosed(1, 5).mapToObj(myFunctionalInterface::mapper)
                .mapToInt(Integer::intValue).sum();
        System.out.println(testVal);
    }
}
