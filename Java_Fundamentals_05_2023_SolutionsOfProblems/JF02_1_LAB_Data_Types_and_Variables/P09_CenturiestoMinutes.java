package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P09_CenturiestoMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short centuries = Short.parseShort(scanner.nextLine());
        int years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",
                centuries, years, days, hours, minutes);
    }
}
