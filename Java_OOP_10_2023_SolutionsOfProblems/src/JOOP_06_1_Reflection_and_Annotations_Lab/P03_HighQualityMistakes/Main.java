package JOOP_06_1_Reflection_and_Annotations_Lab.P03_HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflectionClazz = Reflection.class;

        Field[] fields = reflectionClazz.getDeclaredFields();

        Arrays.stream(fields)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
//                .sorted((a,b) -> a.getName().compareTo(b.getName()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.printf("%s must be private!%n", f.getName()));

        Method[] methodsArr = reflectionClazz.getDeclaredMethods();

        Arrays.stream(methodsArr)
                .filter(m -> m.getName().startsWith("get"))
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
//                .sorted((a,b)->a.getName().compareTo(b.getName()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s have to be public!%n"
                        , m.getName()));

        Arrays.stream(methodsArr)
                .filter(m -> m.getName().startsWith("set"))
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
//                .sorted((a,b)->a.getName().compareTo(b.getName()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s have to be private!%n"
                        , m.getName()));

    }


}
