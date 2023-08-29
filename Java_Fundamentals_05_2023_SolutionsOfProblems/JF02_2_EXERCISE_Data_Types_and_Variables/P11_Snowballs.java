package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double bestSnowballValue = 0;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > bestSnowballValue) {
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
                bestSnowballValue = snowballValue;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, bestSnowballValue, bestSnowballQuality);
    }
}
