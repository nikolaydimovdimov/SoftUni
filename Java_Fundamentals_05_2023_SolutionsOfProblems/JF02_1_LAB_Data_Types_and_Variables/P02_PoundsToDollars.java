package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPounds = Double.parseDouble(scanner.nextLine());
        double usDollars = britishPounds * 1.36;

        System.out.printf("%.3f", usDollars);
    }
}
