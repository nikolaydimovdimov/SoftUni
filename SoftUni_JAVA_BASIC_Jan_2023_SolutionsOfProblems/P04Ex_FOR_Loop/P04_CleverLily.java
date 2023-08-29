package P04Ex_FOR_Loop;

import java.util.Scanner;

public class P04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLili = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int evenYear = ageLili / 2, oddYear = ageLili - evenYear;
        double savedMoney = evenYear * (evenYear + 1) * 10.0 / 2; // Sum of arithmetic progression
        savedMoney = savedMoney - evenYear + priceToy * oddYear;
        if (savedMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", savedMoney - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - savedMoney);
        }
    }
}
