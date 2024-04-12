package org.example.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AnimalImplementation<T extends Animal & Serializable> {
   private T valueToBePrinted;

    public void test() {
        valueToBePrinted.print();
    }
}
