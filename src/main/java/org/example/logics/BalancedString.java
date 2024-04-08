package org.example.logics;

import java.util.Stack;

public class BalancedString {
    private static final Stack<String> stack;

    static {
        stack = new Stack<>();
    }

    public static void main() {
        String name = "[]()";
        System.out.println(findBalanced(name));
    }

    private static boolean findBalanced(String name) {
        for (String value : name.split("")) {
            switch (value) {
                case "{", "(", "[", "<" -> stack.push(value);
                case "}" -> {
                    if (stack.isEmpty() || !stack.pop().equals("{")) return false;
                }
                case ")" -> {
                    if (stack.isEmpty() || !stack.pop().equals("(")) return false;
                }
                case "]" -> {
                    if (stack.isEmpty() || !stack.pop().equals("[")) return false;
                }
                case ">" -> {
                    if (stack.isEmpty() || !stack.pop().equals("<")) return false;
                }
                default -> {
                }
            }
        }
        return stack.isEmpty();
    }

}