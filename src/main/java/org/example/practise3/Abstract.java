package org.example.practise3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Abstract {

    private int value;

    abstract int test();

    abstract void test1();
}
