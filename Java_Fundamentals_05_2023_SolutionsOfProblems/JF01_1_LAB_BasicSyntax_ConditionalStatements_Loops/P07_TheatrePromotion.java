package JF01_1_LAB_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 0 && age <= 18) {
            switch (dayType) {
                case "Weekday":
                    System.out.printf("%d$", 12);
                    break;
                case "Weekend":
                    System.out.printf("%d$", 15);
                    break;
                case "Holiday":
                    System.out.printf("%d$", 5);
                    break;
            }
        } else if (age > 18 && age <= 64) {
            switch (dayType) {
                case "Weekday":
                    System.out.printf("%d$", 18);
                    break;
                case "Weekend":
                    System.out.printf("%d$", 20);
                    break;
                case "Holiday":
                    System.out.printf("%d$", 12);
                    break;
            }
        } else if (age > 64 && age <= 122) {
            switch (dayType) {
                case "Weekday":
                    System.out.printf("%d$", 12);
                    break;
                case "Weekend":
                    System.out.printf("%d$", 15);
                    break;
                case "Holiday":
                    System.out.printf("%d$", 10);
                    break;
            }
        } else {
            System.out.println("Error!");
        }
    }
}
