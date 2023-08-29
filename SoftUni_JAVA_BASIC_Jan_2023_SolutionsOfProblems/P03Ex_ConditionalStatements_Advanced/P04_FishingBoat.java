package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFishers = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
                price = 4200;
                break;
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if (numberFishers <= 6) {
            price = price * 0.9;
        } else if (numberFishers <= 11) {
            price = price * 0.85;
        } else {
            price = price * 0.75;
        }

        if (numberFishers % 2 == 0 && (!season.equals("Autumn"))) {
            price = price * 0.95;
        }

        if (budget < price) {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        }
    }
}
