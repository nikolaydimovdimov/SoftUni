package P08_PreExam_19_02;

import java.util.Scanner;

public class P02_DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodStorage = Integer.parseInt(scanner.nextLine());
        double foodDeer1 = Double.parseDouble(scanner.nextLine());
        double foodDeer2 = Double.parseDouble(scanner.nextLine());
        double foodDeer3 = Double.parseDouble(scanner.nextLine());

        double foodNecessary = days * (foodDeer1 + foodDeer2 + foodDeer3);
        if (foodNecessary > foodStorage) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNecessary - foodStorage));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodStorage - foodNecessary));
        }
    }
}
