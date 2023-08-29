package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P02_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (time) {
            case "Morning":
                if (degree >= 10 && degree <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degree <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degree >= 10 && degree <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                outfit = "Shirt";
                shoes = "Moccasins";
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
    }
}
