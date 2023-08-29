package P01AdditionalProblems_FirstStepInCoding;

import java.util.Scanner;

public class P05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        int rows = (int) (h / 1.20);
        int columns = (int) ((w - 1) / 0.70);
        int workPlaces = rows * columns - 3;

        System.out.println(workPlaces);

    }
}
