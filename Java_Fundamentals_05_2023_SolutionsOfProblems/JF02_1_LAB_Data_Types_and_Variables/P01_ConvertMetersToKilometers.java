package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInMeters = Integer.parseInt(scanner.nextLine());
        double distanceInKilometers = distanceInMeters / 1000.0;
        System.out.printf("%.2f", distanceInKilometers);
    }
}
