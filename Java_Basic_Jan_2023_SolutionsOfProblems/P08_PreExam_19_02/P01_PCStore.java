package P08_PreExam_19_02;

import java.util.Scanner;

public class P01_PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePr = Double.parseDouble(scanner.nextLine());
        double priceVC = Double.parseDouble(scanner.nextLine());
        double priceRAM = Double.parseDouble(scanner.nextLine());
        int numberRAM = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double totalPrice = ((pricePr + priceVC) * (1 - discount) + priceRAM * numberRAM) * 1.57;

        System.out.printf("Money needed - %.2f leva.", totalPrice);
    }
}
