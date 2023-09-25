package JADV3_1_LAB_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> mapCountNumbers = new LinkedHashMap<>();

        for (double number : numbers) {
            mapCountNumbers.putIfAbsent(number, 0);
            mapCountNumbers.put(number, mapCountNumbers.get(number) + 1);
        }

        mapCountNumbers.forEach((key, el) -> System.out.printf("%.1f -> %d%n", key, el));

    }
}
