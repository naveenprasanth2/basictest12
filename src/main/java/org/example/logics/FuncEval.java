package org.example.logics;

public class FuncEval {
    public static void main(String[] args) {
        MathOperation sum = Integer::sum;
        MathOperation product = (a, b) -> a * b;
        MathOperation difference = (a, b) -> a - b;
        MathOperation maximum = Integer::max;

        System.out.println(STR."Sum: \{sum.operate(10, 5)}");        // Outputs 15
        System.out.println(STR."Product: \{product.operate(10, 5)}"); // Outputs 50
        System.out.println(STR."Difference: \{difference.operate(10, 5)}"); // Outputs 5
        System.out.println(STR."Maximum: \{maximum.operate(10, 5)}"); // Outputs 5

    }
}
