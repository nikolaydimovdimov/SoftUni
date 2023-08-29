package P01Ex_FirstStepsInCoding;

import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCm = Integer.parseInt(scanner.nextLine());
        int widthCm = Integer.parseInt(scanner.nextLine());
        int heightCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double waterLtr = lengthCm * widthCm * heightCm * (1 - percent / 100) / 1000;

        System.out.println(waterLtr);

    }
}
