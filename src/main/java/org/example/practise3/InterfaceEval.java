package org.example.practise3;

public class InterfaceEval implements Interface1, Interface2{

    @Override
    public void test() {
        Interface1.super.test();
    }

    public static void main(String[] args) {
        InterfaceEval interfaceEval = new InterfaceEval();
        interfaceEval.test();
    }
}
