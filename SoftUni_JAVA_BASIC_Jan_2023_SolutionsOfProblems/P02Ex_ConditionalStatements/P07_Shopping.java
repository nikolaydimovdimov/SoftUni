package P02Ex_ConditionalStatements;

import java.util.Scanner;

public class P07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double amount = 250 * n;
        amount = amount + m * amount * 0.35 + p * amount * 0.1;

        if (n > m) amount = amount * 0.85;

        if (budget < amount)
            System.out.printf("Not enough money! You need %.2f leva more!", amount - budget);
        else
            System.out.printf("You have %.2f leva left!", budget - amount);

    }
}
