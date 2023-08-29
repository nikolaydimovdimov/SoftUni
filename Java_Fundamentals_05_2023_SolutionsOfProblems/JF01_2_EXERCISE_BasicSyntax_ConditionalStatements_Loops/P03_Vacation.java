package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        switch (day) {
            case "Friday":
                if (groupType.equals("Students")) {
                    price = 8.45;
                    if (peopleNumber >= 30) {
                        price *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 10.9;
                    if (peopleNumber >= 100) {
                        price -= 10 * price / peopleNumber;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 15;
                    if (peopleNumber >= 10 && peopleNumber <= 20) {
                        price *= 0.95;
                    }
                }
                break;
            case "Saturday":
                if (groupType.equals("Students")) {
                    price = 9.8;
                    if (peopleNumber >= 30) {
                        price *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 15.6;
                    if (peopleNumber >= 100) {
                        price -= 10 * price / peopleNumber;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 20;
                    if (peopleNumber >= 10 && peopleNumber <= 20) {
                        price *= 0.95;
                    }
                }
                break;
            case "Sunday":
                if (groupType.equals("Students")) {
                    price = 10.46;
                    if (peopleNumber >= 30) {
                        price *= 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 16;
                    if (peopleNumber >= 100) {
                        price -= 10 * price / peopleNumber;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 22.5;
                    if (peopleNumber >= 10 && peopleNumber <= 20) {
                        price *= 0.95;
                    }
                }
                break;
        }
        price = price * peopleNumber;
        System.out.printf("Total price: %.2f", price);
    }
}
