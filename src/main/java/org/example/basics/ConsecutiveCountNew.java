package org.example.basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class ConsecutiveCountNew {
    public static void main(String[] args) {
        String a = "Amazon is a great company as it has AtoooZzz";
        List<String> test = Stream.of(a.replaceAll("\\s", "")
                .split("")).toList();
        Map<String, Integer> finalMap = getStringIntegerMap(test);

        List<Map.Entry<String, Integer>> finalList = finalMap.entrySet().stream().sorted((x1, x2) -> {
            if (!Objects.equals(x1.getValue(), x2.getValue())) {
                return x2.getValue() - x1.getValue();
            } else {
                return x1.getKey().compareTo(x2.getKey());
            }
        }).toList();

        System.out.println(finalList.getFirst());
    }

    private static Map<String, Integer> getStringIntegerMap(List<String> test) {
        Map<String, Integer> finalMap = new HashMap<>();
        for (int i = 0; i < test.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < test.size(); j++) {
                if (test.get(i).equals(test.get(j))) {
                    count++;
                } else {
                        break;
                    }
                }
            if (!finalMap.containsKey(test.get(i)) || finalMap.get(test.get(i)) < count) {
                finalMap.put(test.get(i), count);
            }
        }
        return finalMap;
    }
}
