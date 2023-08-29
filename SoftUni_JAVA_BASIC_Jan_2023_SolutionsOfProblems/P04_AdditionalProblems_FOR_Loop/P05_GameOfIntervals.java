package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSteps = Integer.parseInt(scanner.nextLine());
        int number = 0, numbers0_9 = 0, numbers10_19 = 0, numbers20_29 = 0,
                numbers30_39 = 0, numbers40_50 = 0, invalidNumbers = 0;
        double result = 0;
        for (int count = 0; count < numberSteps; count++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 50) {
                invalidNumbers++;
                result /= 2;
            } else if (number < 10) {
                numbers0_9++;
                result += number * 0.2;
            } else if (number < 20) {
                numbers10_19++;
                result += number * 0.3;
            } else if (number < 30) {
                numbers20_29++;
                result += number * 0.4;
            } else if (number < 40) {
                numbers30_39++;
                result += 50;
            } else {
                numbers40_50++;
                result += 100;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", numbers0_9 * 100.0 / numberSteps);
        System.out.printf("From 10 to 19: %.2f%%%n", numbers10_19 * 100.0 / numberSteps);
        System.out.printf("From 20 to 29: %.2f%%%n", numbers20_29 * 100.0 / numberSteps);
        System.out.printf("From 30 to 39: %.2f%%%n", numbers30_39 * 100.0 / numberSteps);
        System.out.printf("From 40 to 50: %.2f%%%n", numbers40_50 * 100.0 / numberSteps);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNumbers * 100.0 / numberSteps);
    }
}
