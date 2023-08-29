package P02Ex_ConditionalStatements;

import java.util.Scanner;

public class P04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfTrip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int tracks = Integer.parseInt(scanner.nextLine());

        double amount = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + tracks * 2;

        if (puzzles + dolls + bears + minions + tracks >= 50)
            amount = amount * 0.75;
        amount = amount * 0.9;

        if (amount >= priceOfTrip)
            System.out.printf("Yes! %.2f lv left.", amount - priceOfTrip);
        else
            System.out.printf("Not enough money! %.2f lv needed.", priceOfTrip - amount);

    }
}
