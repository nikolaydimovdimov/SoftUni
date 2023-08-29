package P01AdditionalProblems_FirstStepInCoding;

import java.util.Scanner;

public class P06_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMackerelBGNKg = Double.parseDouble(scanner.nextLine());
        double priceSprinkleBGNKg = Double.parseDouble(scanner.nextLine());
        double weightBonitoKg = Double.parseDouble(scanner.nextLine());
        double weightScadKg = Double.parseDouble(scanner.nextLine());
        int weightMusselsKg = Integer.parseInt(scanner.nextLine());

        double totalPrice = weightBonitoKg * priceMackerelBGNKg * 1.6 + weightScadKg * priceSprinkleBGNKg * 1.8 +
                weightMusselsKg * 7.50;

        System.out.printf("%.2f", totalPrice);
    }

}
