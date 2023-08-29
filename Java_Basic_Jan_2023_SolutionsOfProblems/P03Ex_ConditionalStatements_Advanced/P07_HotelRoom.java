package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStudio = 0;
        double priceApartment = 0;

        String mount = scanner.nextLine();
        int numberStays = Integer.parseInt(scanner.nextLine());

        switch (mount) {
            case "May":
            case "October":
                priceStudio = numberStays * 50.0;
                priceApartment = numberStays * 65.0;
                if (numberStays > 14) {
                    priceStudio = priceStudio * 0.7;
                    priceApartment = priceApartment * 0.9;
                } else if (numberStays > 7) {
                    priceStudio = priceStudio * 0.95;
                }
                break;
            case "June":
            case "September":
                priceStudio = numberStays * 75.20;
                priceApartment = numberStays * 68.70;
                if (numberStays > 14) {
                    priceStudio = priceStudio * 0.8;
                    priceApartment = priceApartment * 0.9;
                }
                break;
            case "July":
            case "August":
                priceStudio = numberStays * 76;
                priceApartment = numberStays * 77;
                if (numberStays > 14) {
                    priceApartment = priceApartment * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
