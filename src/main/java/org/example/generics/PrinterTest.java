package org.example.generics;

public class PrinterTest {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(5);
        Printer<String> printer1 = new Printer<>("summa");
        System.out.println(printer.getNumber());
        System.out.println(printer1.getNumber());
    }
}
