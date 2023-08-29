package P01AdditionalProblems_FirstStepInCoding;

import java.util.Scanner;

public class P04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetablesBGN = Double.parseDouble(scanner.nextLine());
        double priceFruitsBGN = Double.parseDouble(scanner.nextLine());
        int weightVegetablesKg = Integer.parseInt(scanner.nextLine());
        int weightFruitsKg = Integer.parseInt(scanner.nextLine());

        double totalPriceEUR = (weightVegetablesKg * priceVegetablesBGN +
                weightFruitsKg * priceFruitsBGN) / 1.94;

        System.out.printf("%.2f", totalPriceEUR);

    }
}
