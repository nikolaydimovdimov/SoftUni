package JF07_LAB_Associative_Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01_CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numMap = new TreeMap<>();

        double[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double number : numbers) {
            numMap.putIfAbsent(number, 0);
            numMap.put(number, numMap.get(number) + 1);
        }

        for (Map.Entry<Double, Integer> item : numMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", item.getKey(), item.getValue());
        }
    }
}
