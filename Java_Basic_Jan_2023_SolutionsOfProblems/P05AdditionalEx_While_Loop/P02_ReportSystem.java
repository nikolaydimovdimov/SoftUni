package P05AdditionalEx_While_Loop;

import java.util.Scanner;

public class P02_ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredMoney = Integer.parseInt(scanner.nextLine());
        int cashMoney = 0, cashPays = 0, cardMoney = 0, cardPays = 0, payCounter = 0, price = 0;
        String input = "";
        while (cashMoney + cardMoney < requiredMoney) {
            input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            price = Integer.parseInt(input);
            payCounter++;
            if (payCounter == 2) {
                payCounter = 0;
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cardPays++;
                    cardMoney += price;
                }
            } else {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cashPays++;
                    cashMoney += price;
                }
            }
        }
        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n" +
                    "Average CC: %.2f", cashMoney * 1.0 / cashPays, cardMoney * 1.0 / cardPays);
        }
    }
}
