package org.example.singleton2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

//        Class<?> singletonClass = singleton.getClass();
        Class<?> singletonClass = Class.forName("org.example.singleton2.Singleton");
        Constructor<?> singletonCons = singletonClass.getDeclaredConstructor();
        singletonCons.setAccessible(true);
        Singleton singleton1 = (Singleton) singletonCons.newInstance();
        System.out.println(singleton1.hashCode());
    }
}
