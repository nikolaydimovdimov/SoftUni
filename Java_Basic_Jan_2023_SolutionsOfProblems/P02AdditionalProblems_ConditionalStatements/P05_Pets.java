package P02AdditionalProblems_ConditionalStatements;

import java.util.Scanner;

public class P05_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodWeight = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine()) / 1000;
        double totalPetsFood = (dogFood + catFood + turtleFood) * days;

        if (totalPetsFood <= foodWeight)
            System.out.printf("%.0f kilos of food left.", Math.floor(foodWeight - totalPetsFood));
        else
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalPetsFood - foodWeight));
    }
}
