package org.example.inner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Animal {
   private int num;
    public void shout(){
        System.out.println("hahaha");
    }
    @AllArgsConstructor
    @Getter
    @Setter
    protected static class Elephant {
       private int num;
    }
}
