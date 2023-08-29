package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int waterInTank = 0;
        for (int i = 0; i < numberOfLines; i++) {
            int quantityOfWater = Integer.parseInt(scanner.nextLine());
            if ((waterInTank + quantityOfWater) > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                waterInTank += quantityOfWater;
            }
        }
        System.out.println(waterInTank);
    }
}
