package org.example.singleton;

import java.io.*;

public class SerializableBreak {
    public static void main() throws IOException, ClassNotFoundException {
        Singleton s1 = Singleton.getSingleton();
        System.out.println(s1.hashCode());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("\\test.ser"));
        objectOutputStream.writeObject(s1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("\\test.ser"));
        Singleton s2 = (Singleton) objectInputStream.readObject();

        System.out.println(s2.hashCode());

    }
}
