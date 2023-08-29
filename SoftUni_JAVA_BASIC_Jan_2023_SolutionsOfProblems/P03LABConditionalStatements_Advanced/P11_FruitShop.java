package P03LABConditionalStatements_Advanced;

import java.util.Scanner;

public class P11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            if (fruitType.equals("banana")) {
                System.out.printf("%.2f", quantity * 2.5);
            } else if (fruitType.equals("apple")) {
                System.out.printf("%.2f", quantity * 1.2);
            } else if (fruitType.equals("orange")) {
                System.out.printf("%.2f", quantity * 0.85);
            } else if (fruitType.equals("grapefruit")) {
                System.out.printf("%.2f", quantity * 1.45);
            } else if (fruitType.equals("kiwi")) {
                System.out.printf("%.2f", quantity * 2.7);
            } else if (fruitType.equals("pineapple")) {
                System.out.printf("%.2f", quantity * 5.5);
            } else if (fruitType.equals("grapes")) {
                System.out.printf("%.2f", quantity * 3.85);
            } else {
                System.out.println("error");
            }
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            if (fruitType.equals("banana")) {
                System.out.printf("%.2f", quantity * 2.7);
            } else if (fruitType.equals("apple")) {
                System.out.printf("%.2f", quantity * 1.25);
            } else if (fruitType.equals("orange")) {
                System.out.printf("%.2f", quantity * 0.9);
            } else if (fruitType.equals("grapefruit")) {
                System.out.printf("%.2f", quantity * 1.60);
            } else if (fruitType.equals("kiwi")) {
                System.out.printf("%.2f", quantity * 3);
            } else if (fruitType.equals("pineapple")) {
                System.out.printf("%.2f", quantity * 5.6);
            } else if (fruitType.equals("grapes")) {
                System.out.printf("%.2f", quantity * 4.2);
            } else {
                System.out.println("error");
            }
        } else System.out.println("error");
    }
}
