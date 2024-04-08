package org.example.logics;

import java.util.List;
import java.util.Stack;

public class BalString {
    public static void main() {
        String name = "[]()";
        System.out.println(findBalanced(name));
    }

    private static boolean findBalanced(String name) {
        final Stack<String> finalStack = new Stack<>();
        String[] bracesList = name.split("");
        for (String val : bracesList) {
            switch (val) {
                case "{", "(", "[", "<" -> finalStack.push(val);
                case "}" -> {
                    if (finalStack.isEmpty() || !finalStack.pop().equals("{")) return false;
                }
                case ")" -> {
                    if (finalStack.isEmpty() || !finalStack.pop().equals("(")) return false;
                }
                case "]" -> {
                    if (finalStack.isEmpty() || !finalStack.pop().equals("[")) return false;
                }
                case ">" -> {
                    if (finalStack.isEmpty() || finalStack.pop().equals("<")) return false;
                }
            }
        }
        return finalStack.isEmpty();
    }
}
