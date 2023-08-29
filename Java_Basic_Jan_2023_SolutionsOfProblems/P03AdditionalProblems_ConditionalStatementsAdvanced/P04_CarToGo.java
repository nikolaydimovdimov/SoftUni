package P03AdditionalProblems_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String carType = "";

        if (budget <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                budget = budget * 0.35;
            } else {
                carType = "Jeep";
                budget = budget * 0.65;
            }
        } else if (budget <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                budget = budget * 0.45;
            } else {
                carType = "Jeep";
                budget = budget * 0.8;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            budget = budget * 0.9;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, budget);
    }
}
