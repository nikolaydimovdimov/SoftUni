package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = (daysStay - 1) * 18;
                break;
            case "apartment":
                price = (daysStay - 1) * 25;
                if (daysStay > 15) {
                    price = price * 0.5;
                } else if (daysStay > 10) {
                    price = price * 0.65;
                } else {
                    price = price * 0.7;
                }
                break;
            case "president apartment":
                price = (daysStay - 1) * 35;
                if (daysStay > 15) {
                    price = price * 0.8;
                } else if (daysStay > 10) {
                    price = price * 0.85;
                } else {
                    price = price * 0.9;
                }
                break;
        }

        if (review.equals("positive")) {
            price = price * 1.25;
        } else {
            price = price * 0.9;
        }

        System.out.printf("%.2f", price);
    }
}
