package P03AdditionalProblems_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03_Flowers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberChrysanthemums = Integer.parseInt(scanner.nextLine());
        int numberRoses = Integer.parseInt(scanner.nextLine());
        int numberTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isWeekend = scanner.nextLine();
        double price = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                price = numberChrysanthemums * 2.0 + numberRoses * 4.1 + numberTulips * 2.5;
                break;
            case "Autumn":
            case "Winter":
                price = numberChrysanthemums * 3.75 + numberRoses * 4.5 + numberTulips * 4.15;
                break;
        }
        if (numberTulips > 7 && season.equals("Spring")) price = price * 0.95;
        if (numberRoses >= 10 && season.equals("Winter")) price = price * 0.9;
        if (isWeekend.equals("Y")) price = price * 1.15;
        if ((numberChrysanthemums + numberRoses + numberTulips) > 20) price = price * 0.8;

        System.out.printf("%.2f", price + 2);
    }
}
