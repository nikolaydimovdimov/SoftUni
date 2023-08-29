package JF4_1_LAB_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat numberFormat = new DecimalFormat("0.####");

        System.out.println(numberFormat.format(mathPower(number, power)));

    }

    public static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
