package JADV3_1_LAB_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> storesMap = new TreeMap<>();

        String[] input = scanner.nextLine().split(", ");

        while (!input[0].equals("Revision")) {
            storesMap.putIfAbsent(input[0], new LinkedHashMap<>());
            storesMap.get(input[0]).put(input[1], Double.parseDouble(input[2]));


            input = scanner.nextLine().split(", ");
        }

        for (Map.Entry<String, Map<String, Double>> store : storesMap.entrySet()) {
            System.out.println(store.getKey() + "->");
            store.getValue().forEach((prod, price) -> System.out.printf("Product: %s, Price: %.1f%n", prod, price));
        }
    }
}
