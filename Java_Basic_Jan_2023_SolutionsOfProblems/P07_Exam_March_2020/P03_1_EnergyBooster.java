package P07_Exam_March_2020;

import java.util.Scanner;

public class P03_1_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String size = scanner.nextLine();
        int numberSets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (type) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = numberSets * 2 * 56;
                } else {
                    price = numberSets * 5 * 28.7;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = numberSets * 2 * 36.66;
                } else {
                    price = numberSets * 5 * 19.6;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = numberSets * 2 * 42.1;
                } else {
                    price = numberSets * 5 * 24.8;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = numberSets * 2 * 20;
                } else {
                    price = numberSets * 5 * 15.2;
                }
                break;
        }
        if (price > 1000) {
            price = price * 0.5;
        } else if (price >= 400) {
            price = price * 0.85;
        }
        System.out.printf("%.2f lv.", price);
    }
}
