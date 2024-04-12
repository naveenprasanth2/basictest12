package org.example.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AnimalImplementation<T extends Animal> {
   private T valueToBePrinted;

    public void test() {
        valueToBePrinted.print();
    }
}
