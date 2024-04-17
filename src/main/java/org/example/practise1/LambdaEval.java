package org.example.practise1;

public class LambdaEval {
    public static void main(String[] args) {
        NewInterface newInterface = () -> System.out.println("summa");
        newInterface.summa();
        NewInterface.staticMethod();
        newInterface.defaultMethod();
    }
}
