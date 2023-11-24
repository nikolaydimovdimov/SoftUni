package JOOP_06_2_Reflection_and_Annotations_Ex.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> blackBoxIntClazz=BlackBoxInt.class;
        Constructor<?> constructorBlBox=blackBoxIntClazz.getDeclaredConstructor();
        constructorBlBox.setAccessible(true);
        Object newInstBlackBox=constructorBlBox.newInstance();

        String[] token=scanner.nextLine().split("_");

        while (!token[0].equals("END")){

            String method=token[0];
            int argument=Integer.parseInt(token[1]);

            Method methodBlBox=newInstBlackBox.getClass().getDeclaredMethod(method, int.class);
            methodBlBox.setAccessible(true);
            methodBlBox.invoke(newInstBlackBox ,argument);

            Field fieldInnerValue=newInstBlackBox.getClass().getDeclaredField("innerValue");
            fieldInnerValue.setAccessible(true);
            System.out.println(fieldInnerValue.get(newInstBlackBox));

            token=scanner.nextLine().split("_");
        }
    }
}
