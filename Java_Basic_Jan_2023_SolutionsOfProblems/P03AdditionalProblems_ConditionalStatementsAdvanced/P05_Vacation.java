package P03AdditionalProblems_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String accommodationType = "";
        String destination = "";

        if (budget <= 1000) {
            accommodationType = "Camp";
            if (season.equals("Summer")) {
                destination = "Alaska";
                budget = budget * 0.65;
            } else {
                destination = "Morocco";
                budget = budget * 0.45;
            }
        } else if (budget <= 3000) {
            accommodationType = "Hut";
            if (season.equals("Summer")) {
                destination = "Alaska";
                budget = budget * 0.8;
            } else {
                destination = "Morocco";
                budget = budget * 0.6;
            }
        } else {
            accommodationType = "Hotel";
            budget = budget * 0.9;
            if (season.equals("Summer")) {
                destination = "Alaska";
            } else {
                destination = "Morocco";
            }
        }
        System.out.printf("%s - %s - %.2f", destination, accommodationType, budget);
    }

}

