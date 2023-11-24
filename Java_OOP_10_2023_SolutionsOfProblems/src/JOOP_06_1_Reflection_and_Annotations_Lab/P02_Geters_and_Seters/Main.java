package JOOP_06_1_Reflection_and_Annotations_Lab.P02_Geters_and_Seters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflectionClazz = Reflection.class;
        Method[] methodsArr = reflectionClazz.getDeclaredMethods();

        Arrays.stream(methodsArr)
                .filter(m -> m.getName().startsWith("get"))
//                .sorted((a,b)->a.getName().compareTo(b.getName()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s will return class %s%n"
                        , m.getName(), m.getReturnType().getName()));

        Arrays.stream(methodsArr)
                .filter(m -> m.getName().startsWith("set"))
//                .sorted((a,b)->a.getName().compareTo(b.getName()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s and will set field of class %s%n"
                        , m.getName(), m.getParameterTypes()[0].getName()));

    }


}
