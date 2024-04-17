package org.example.singleton1;

import java.io.*;

public class SerializableBreak {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serializable.ser"));
        objectOutputStream.writeObject(singleton);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serializable.ser"));
        Singleton singleton1 = (Singleton) objectInputStream.readObject();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
