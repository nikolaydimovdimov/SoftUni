package P02Ex_ConditionalStatements;

import java.util.Scanner;

public class P05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceOfClothes = Double.parseDouble(scanner.nextLine());

        if (people > 150)
            priceOfClothes = priceOfClothes * people * 0.9;
        else
            priceOfClothes = priceOfClothes * people;

        double totalPrice = priceOfClothes + budget * 0.1;

        if (totalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        }
    }
}
