package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.Scanner;

public class AdP01_BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysNumber = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double currentPlunder = 0;

        for (int day = 1; day <= daysNumber; day++) {
            currentPlunder += dailyPlunder * 1.0;

            if (day % 3 == 0) {
                currentPlunder += dailyPlunder * 0.5;
            }

            if (day % 5 == 0) {
                currentPlunder *= 0.7;
            }
        }

        if (currentPlunder < expectedPlunder) {
            System.out.printf("Collected only %.2f%% of the plunder.", currentPlunder / expectedPlunder * 100);
        } else {
            System.out.printf("Ahoy! %.2f plunder gained.", currentPlunder);
        }
    }
}
