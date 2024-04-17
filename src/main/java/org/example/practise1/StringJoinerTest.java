package org.example.practise1;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerTest {

    public static void main(String[] args) {
        System.out.println(caesarCipher("vuybvuyb-fbyurbfyubreuy-bcyubeuvybfrv-", 3));
    }
    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringJoiner joiner = new StringJoiner("");
        List<String> test = Stream.of(s.split("")).map(String::new).toList();
        for(String x: test){
            if(x.matches("[a-zA-Z]")){
                char c = x.toCharArray()[0];
                c+=3;
                joiner.add(String.valueOf(c));
            }
        }
        return joiner.toString();
    }
}
