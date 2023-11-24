package JOOP_06_2_Reflection_and_Annotations_Ex.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class<RichSoilLand> richSoilLandClazz = RichSoilLand.class;

        Field[] fieldsArr = richSoilLandClazz.getDeclaredFields();

        Consumer<Field> outputField = field -> System.out.printf("%s %s %s%n",
                Modifier.toString(field.getModifiers()),
                field.getType().getSimpleName(),
                field.getName());

        String token = scanner.nextLine();
        while (!token.equals("HARVEST")) {
            if(!token.equals("all")) {
                String typeWord = token;
                Arrays.stream(fieldsArr)
                        .filter(f -> Modifier.toString(f.getModifiers()).equals(typeWord))
                        .forEach(f -> outputField.accept(f));
            }else Arrays.stream(fieldsArr).forEach(f -> outputField.accept(f));
            token = scanner.nextLine();
        }

    }
}
