package P01AdditionalProblems_FirstStepInCoding;

import java.util.Scanner;

public class P07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wallsArea = 2 * x * (x + y) - 2 * 1.2 - 2 * 1.5 * 1.5;
        double roofArea = x * (h + 2 * y);

        System.out.printf("%.2f%n", wallsArea / 3.4);
        System.out.printf("%.2f", roofArea / 4.3);

    }
}
