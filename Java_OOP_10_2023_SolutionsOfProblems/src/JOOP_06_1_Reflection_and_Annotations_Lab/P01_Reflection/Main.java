package JOOP_06_1_Reflection_and_Annotations_Lab.P01_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> reflectionClazz=Reflection.class;
        System.out.println(reflectionClazz);
        Class<? super Reflection> superClass=reflectionClazz.getSuperclass();
        System.out.println(superClass);
        Class<?>[] interfaces=reflectionClazz.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);



// make up new Instance:

        Constructor<?> constructor=reflectionClazz.getConstructor();
        constructor.setAccessible(true);
        Object reflectionInstance=constructor.newInstance();
        System.out.println(reflectionInstance);



    }
}
