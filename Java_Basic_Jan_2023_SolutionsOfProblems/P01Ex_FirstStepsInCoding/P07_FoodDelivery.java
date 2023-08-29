package P01Ex_FirstStepsInCoding;

import java.util.Scanner;

public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double cost = (chickenMenus * 10.35 + fishMenus * 12.40 + vegetarianMenus * 8.15) * 1.2 + 2.50;

        System.out.println(cost);

    }
}
