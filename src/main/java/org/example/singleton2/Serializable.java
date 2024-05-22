package org.example.singleton2;

import java.io.*;

public class Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("sin.ser"));
        objectOutputStream.writeObject(singleton);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("sin.ser"));
        Singleton singleton1 = (Singleton) objectInputStream.readObject();
        System.out.println(singleton1.hashCode());
    }
}
