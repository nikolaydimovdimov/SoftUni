package P02AdditionalProblems_ConditionalStatements;

import java.util.Scanner;

public class P03_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xScrM = Integer.parseInt(scanner.nextLine());
        double yKgM = Double.parseDouble(scanner.nextLine());
        int zLtr = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double vineLtr = (xScrM * yKgM) * 0.4 / 2.5;

        if (vineLtr < zLtr) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(zLtr - vineLtr));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",
                    Math.floor(vineLtr));
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(vineLtr - zLtr), Math.ceil((vineLtr - zLtr) / workers));
        }
    }
}
