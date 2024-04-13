package org.example.sealed;

public sealed class Elephant extends Animal permits Lion {
    public Elephant(String name, String work) {
        super(name, work);
    }
}
