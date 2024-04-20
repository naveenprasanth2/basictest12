package org.example.practise3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class OuterClass {
    private int val;

    @AllArgsConstructor
    @Getter
    @Setter
    static class InnerClass {
        private int val;
    }

    public static void main() {
        OuterClass outerClass = new OuterClass(10);
        System.out.println(outerClass.getVal());
        InnerClass innerClass = new OuterClass.InnerClass(5);
        System.out.println(innerClass.getVal());
    }
}
