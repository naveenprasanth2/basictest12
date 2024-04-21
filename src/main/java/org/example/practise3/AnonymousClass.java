package org.example.practise3;

public class AnonymousClass {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int subtract(int a, int b) {
                return a - b;
            }

            public int multiply(int a, int b) {
                return a / b;
            }
        };

        System.out.println(myInterface.add(10, 5));
        System.out.println(myInterface.subtract(9, 5));
        System.out.println(myInterface.multiply(10, 10));
    }
}
