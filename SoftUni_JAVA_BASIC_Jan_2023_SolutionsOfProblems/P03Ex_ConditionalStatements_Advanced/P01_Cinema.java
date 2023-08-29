package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cinemaType = scanner.nextLine();

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        switch (cinemaType) {
            case "Premiere":
                System.out.printf("%.2f leva", rows * columns * 12.0);
                break;
            case "Normal":
                System.out.printf("%.2f leva", rows * columns * 7.5);
                break;
            case "Discount":
                System.out.printf("%.2f leva", rows * columns * 5.0);
                break;
        }
    }
}
