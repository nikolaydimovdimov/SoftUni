package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String floursType = scanner.nextLine();
        int numberFlours = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double amount = 0;
        switch (floursType) {
            case "Roses":
                amount = numberFlours * 5.0;
                if (numberFlours > 80) amount = amount * 0.9;
                break;
            case "Dahlias":
                amount = numberFlours * 3.80;
                if (numberFlours > 90) amount = amount * 0.85;
                break;
            case "Tulips":
                amount = numberFlours * 2.80;
                if (numberFlours > 80) amount = amount * 0.85;
                break;
            case "Narcissus":
                amount = numberFlours * 3.0;
                if (numberFlours < 120) amount = amount * 1.15;
                break;
            case "Gladiolus":
                amount = numberFlours * 2.5;
                if (numberFlours < 80) amount = amount * 1.2;
                break;
        }
        if (budget >= amount) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    numberFlours, floursType, budget - amount);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", amount - budget);
        }
    }
}
