package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coinInput = scanner.nextLine();
        String productInput = "";
        double lastProductPrice = 0;
        double sumMoney = 0;
        double purchasePrice = 0;
        while (!coinInput.equals("Start")) {
            switch (coinInput) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    sumMoney += Double.parseDouble(coinInput);
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", Double.parseDouble(coinInput));
                    break;
            }
            coinInput = scanner.nextLine();
        }
        productInput = scanner.nextLine();
        while (!productInput.equals("End")) {
            switch (productInput) {
                case "Nuts":
                    lastProductPrice = 2;
                    break;
                case "Water":
                    lastProductPrice = 0.7;
                    break;
                case "Crisps":
                    lastProductPrice = 1.5;
                    break;
                case "Soda":
                    lastProductPrice = 0.8;
                    break;
                case "Coke":
                    lastProductPrice = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (lastProductPrice > 0) {
                if (purchasePrice + lastProductPrice <= sumMoney) {
                    System.out.printf("Purchased %s%n", productInput);
                    purchasePrice += lastProductPrice;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            productInput = scanner.nextLine();
            lastProductPrice = 0;
        }
        System.out.printf("Change: %.2f%n", sumMoney - purchasePrice);
    }

}
