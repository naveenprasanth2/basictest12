package org.example.logics;

public class InnerClass {
    String name = "naveen";

    static class Test{
        String name = "prasanth";
        static class Test1{
            String name = "summa";
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
//        Test test = new InnerClass.Test();
        Test test = new InnerClass.Test();
        Test.Test1 test1 = new Test.Test1();
        System.out.println(test.name);
    }

}