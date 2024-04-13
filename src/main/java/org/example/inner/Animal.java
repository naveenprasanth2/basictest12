package org.example.inner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Animal {
    int num;

    @AllArgsConstructor
    protected static class Elephant {
        int num;
    }
}
