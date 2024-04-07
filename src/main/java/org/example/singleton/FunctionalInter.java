package org.example.singleton;

@FunctionalInterface
public interface FunctionalInter {

    boolean check();

    default boolean isNotNullOrEmpty(String value){
        return value != null && !value.isEmpty();
    }
}
