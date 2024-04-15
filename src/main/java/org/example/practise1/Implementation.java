package org.example.practise1;

public class Implementation {
    public static void main() {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void summa() {
                System.out.println("summa");
            }

            @Override
            public void test(String value1, String value2) {
                System.out.println(STR."\{value1}, \{value2}");
            }
        };

        myInterface.summa();
        myInterface.testing();
        myInterface.test("naveen", "prasanth");
    }
}
