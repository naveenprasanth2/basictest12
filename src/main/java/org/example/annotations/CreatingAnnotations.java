package org.example.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CreatingAnnotations {
    public static void main(String[] args) {
//        @SuppressWarnings("unused")
        Cat cat = new Cat("Poona");
        Annotation[] annotations = cat.getClass().getAnnotations();
        System.out.println(Arrays.toString(annotations));
        if(cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("It is present");
        }

        Arrays.stream(cat.getClass().getDeclaredMethods()).filter(x -> x.isAnnotationPresent(RunImmediately.class))
                .findFirst().ifPresentOrElse(x -> {
                    try {
                        x.invoke(cat);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }, () -> System.out.println("No methods found"));
    }
}
