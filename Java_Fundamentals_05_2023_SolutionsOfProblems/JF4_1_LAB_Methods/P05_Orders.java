package JF4_1_LAB_Methods;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        calculateOrder(product, quantity);

    }

    public static void calculateOrder(String productType, int quantityOfProduct) {
        double price = 0.0;

        switch (productType) {
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2;
                break;
        }

        System.out.printf("%.2f", quantityOfProduct * price);
    }
}
