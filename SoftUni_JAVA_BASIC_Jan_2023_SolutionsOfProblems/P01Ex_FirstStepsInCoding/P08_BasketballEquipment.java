package P01Ex_FirstStepsInCoding;

import java.util.Scanner;

public class P08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int costPerYear = Integer.parseInt(scanner.nextLine());
        double totalCost = costPerYear + costPerYear * 0.60 + costPerYear * 0.60 * 0.80 +
                costPerYear * 0.60 * 0.80 / 4 + costPerYear * 0.60 * 0.80 / 20; // *2.224

        System.out.println(totalCost);
    }
}
