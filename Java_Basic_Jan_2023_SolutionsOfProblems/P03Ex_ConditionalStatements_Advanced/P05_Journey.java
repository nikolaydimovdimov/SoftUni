package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeRest = "";
        double price = 0;


        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.30;
                typeRest = "Camp";
            } else {
                price = budget * 0.70;
                typeRest = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.40;
                typeRest = "Camp";
            } else {
                price = budget * 0.80;
                typeRest = "Hotel";
            }
        } else {
            destination = "Europe";
            price = budget * 0.90;
            typeRest = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeRest, price);
    }
}
