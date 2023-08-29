package P01AdditionalProblems_FirstStepInCoding;

import java.util.Scanner;

public class P03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreesCelsius = Double.parseDouble(scanner.nextLine());
        double degreesFahrenheit = degreesCelsius * 9 / 5 + 32;

        System.out.printf("%.2f", degreesFahrenheit);
    }
}
