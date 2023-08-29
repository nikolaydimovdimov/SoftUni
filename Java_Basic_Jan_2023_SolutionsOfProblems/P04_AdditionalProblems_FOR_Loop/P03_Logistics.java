package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCargo = Integer.parseInt(scanner.nextLine());
        int busCargo = 0, trackCargo = 0, trainCargo = 0;
        for (int count = 0; count < numberCargo; count++) {
            int weightCargo = Integer.parseInt(scanner.nextLine());
            if (weightCargo < 4) {
                busCargo += weightCargo;
            } else if (weightCargo < 12) {
                trackCargo += weightCargo;
            } else {
                trainCargo += weightCargo;
            }
        }
        System.out.printf("%.2f%n", (busCargo * 200.0 + trackCargo * 175.0 + trainCargo * 120) /
                (busCargo + trainCargo + trackCargo));
        System.out.printf("%.2f%%%n", busCargo * 100.0 / (busCargo + trackCargo + trainCargo));
        System.out.printf("%.2f%%%n", trackCargo * 100.0 / (busCargo + trackCargo + trainCargo));
        System.out.printf("%.2f%%%n", trainCargo * 100.0 / (busCargo + trackCargo + trainCargo));
    }
}
