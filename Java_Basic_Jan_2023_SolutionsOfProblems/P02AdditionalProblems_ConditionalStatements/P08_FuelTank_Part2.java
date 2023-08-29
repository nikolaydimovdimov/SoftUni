package P02AdditionalProblems_ConditionalStatements;

import java.util.Scanner;

public class P08_FuelTank_Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelLtr = Double.parseDouble(scanner.nextLine());
        String cardHolder = scanner.nextLine();
        double fuelPrice = 0;
        if (fuelType.equals("Gas")) {
            fuelPrice = 0.93;
            if (cardHolder.equals("Yes")) fuelPrice = fuelPrice - 0.08;
        } else if (fuelType.equals("Gasoline")) {
            fuelPrice = 2.22;
            if (cardHolder.equals("Yes")) fuelPrice = fuelPrice - 0.18;

        } else {
            fuelPrice = 2.33;
            if (cardHolder.equals("Yes")) fuelPrice = fuelPrice - 0.12;
        }

        fuelPrice = fuelPrice * fuelLtr;

        if (fuelLtr > 25)
            fuelPrice = fuelPrice * 0.9;
        else if (!(fuelLtr < 20))
            fuelPrice = fuelPrice * 0.92;

        System.out.printf("%.2f lv.", fuelPrice);
    }
}
