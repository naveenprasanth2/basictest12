package org.example.basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ConsecutiveCount {
    public static void main() {
        String a = "Amaazon is a great company as it has AtoooZzz";
        List<String> test = Stream.of(a.replaceAll("\\s", "").split("")).toList();
        Map<String, Integer> finalMap = new HashMap<>();
        int count;
        for (int i = 0; i < test.size(); i++) {
            count = 1;
            for (int j = i+1; j < test.size(); j++) {
                if (test.get(i).equals(test.get(j))) {
                    count++;
                } else {
                    if (finalMap.containsKey(test.get(i))) {
                        finalMap.put(test.get(i), finalMap.get(test.get(i)) < count ? count : finalMap.get(test.get(i)));
                    } else {
                        finalMap.put(test.get(i), count);
                    }
                    break;
                }
            }
        }

        test.stream().filter(x -> finalMap.get(x) > 1).skip(1).findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("No consecutive characters"));
    }
}
