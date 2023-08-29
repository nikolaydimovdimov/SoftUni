package P07_Exam_March_2020;

import java.util.Scanner;

public class P03_2_FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;
        switch (sport) {
            case "Gym":
                if (sex.equals("m")) {
                    price = 42;
                } else {
                    price = 35;
                }
                break;
            case "Boxing":
                if (sex.equals("m")) {
                    price = 41;
                } else {
                    price = 37;
                }
                break;
            case "Yoga":
                if (sex.equals("m")) {
                    price = 45;
                } else {
                    price = 42;
                }
                break;
            case "Zumba":
                if (sex.equals("m")) {
                    price = 34;
                } else {
                    price = 31;
                }
                break;
            case "Dances":
                if (sex.equals("m")) {
                    price = 51;
                } else {
                    price = 53;
                }
                break;
            case "Pilates":
                if (sex.equals("m")) {
                    price = 39;
                } else {
                    price = 37;
                }
                break;

        }
        if (age <= 19) {
            price *= 0.8;
        }
        if (price <= sum) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - sum);
        }
    }
}
