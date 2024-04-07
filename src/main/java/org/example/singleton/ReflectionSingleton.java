package org.example.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton s1 = Singleton.getSingleton();
        System.out.println(s1.hashCode());

        Class<?> singletonClass = s1.getClass();
        Constructor<?> singletonCons = singletonClass.getDeclaredConstructor();
        singletonCons.setAccessible(true);
        Singleton s2 = (Singleton) singletonCons.newInstance();
        System.out.println(s2.hashCode());
    }
}
