package JOOP_02_2_Encapsulation_Ex.P04_Pizza_Calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] token = scanner.nextLine().split("\\s+");

        System.out.println();

        Pizza pizza = null;
        try {
            pizza = new Pizza(token[1], Integer.parseInt(token[2]));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            System.exit(-1);
        }

        token = scanner.nextLine().split("\\s+");

        Dough dough = null;

        try {
            dough = new Dough(token[1], token[2], Integer.parseInt(token[3]));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            System.exit(-1);
        }

        pizza.setDough(dough);

        token = scanner.nextLine().split("\\s+");

        while (!token[0].equals("END")) {
            Topping topping = null;

            try {
                topping = new Topping(token[1], Integer.parseInt(token[2]));
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
                System.exit(-1);
            }

            pizza.addTopping(topping);
            token = scanner.nextLine().split("\\s+");
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());


    }
}
