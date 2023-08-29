package P01AdditionalProblems_FirstStepInCoding;

import java.util.Scanner;

public class P08_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f%n", Math.PI * Math.pow(r, 2));
        System.out.printf("%.2f%n", 2 * Math.PI * r);
    }
}
