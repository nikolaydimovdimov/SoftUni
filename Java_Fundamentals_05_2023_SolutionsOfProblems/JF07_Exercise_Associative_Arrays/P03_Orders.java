package JF07_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productsPriceMap = new LinkedHashMap<>();
        Map<String, Integer> productsQuantityMap = new LinkedHashMap<>();

        String lineText = scanner.nextLine();

        while (!lineText.equals("buy")) {
            String name = lineText.split(" ")[0];
            double price = Double.parseDouble(lineText.split(" ")[1]);
            int quantity = Integer.parseInt(lineText.split(" ")[2]);

            productsPriceMap.putIfAbsent(name, 0.0);
            productsQuantityMap.putIfAbsent(name, 0);

            productsPriceMap.put(name, price);
            productsQuantityMap.put(name, productsQuantityMap.get(name) + quantity);

            lineText = scanner.nextLine();
        }

        for (Map.Entry<String, Double> product : productsPriceMap.entrySet()) {
            double totalPrice = product.getValue() * productsQuantityMap.get(product.getKey()).doubleValue();
            System.out.printf("%s -> %.2f%n", product.getKey(), totalPrice);
        }
    }
}
