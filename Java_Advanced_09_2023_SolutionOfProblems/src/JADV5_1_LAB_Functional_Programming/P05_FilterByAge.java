package JADV5_1_LAB_Functional_Programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class P05_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> people = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(",\\s+");
            people.put(input[0], Integer.parseInt(input[1]));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> filter = createFilter(condition, age);

        for (Map.Entry<String, Integer> person : people.entrySet()) {

            if (filter.test(person.getValue())) {
                System.out.println(outputFormatted(person, format));
            }
        }

    }

    private static String outputFormatted(Map.Entry<String, Integer> person, String format) {
        if (format.equals("name")) {
            return person.getKey();
        } else if (format.equals("age")) {
            return String.valueOf(person.getValue());
        } else {
            return person.getKey() + " - " + person.getValue();
        }
    }

    private static Predicate<Integer> createFilter(String condition, int age) {
        if (condition.equals("older")) {
            return ageOfPerson -> ageOfPerson >= age;
        } else return ageOfPerson -> ageOfPerson <= age;
    }
}
