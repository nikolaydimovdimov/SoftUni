package JF55_Exam_18_06_2023;

import java.util.Scanner;

public class P01_CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        int freePackageFlour = students / 5;

        double totalPrice = Math.ceil(students * 1.2) * apronPrice;
        totalPrice += students * eggPrice * 10;
        totalPrice += students * flourPrice - freePackageFlour * flourPrice;

        if (totalPrice <= budget) {
            System.out.printf("Items purchased for %.2f$.", totalPrice);
        } else {
            System.out.printf("%.2f$ more needed.", totalPrice - budget);
        }

    }
}
