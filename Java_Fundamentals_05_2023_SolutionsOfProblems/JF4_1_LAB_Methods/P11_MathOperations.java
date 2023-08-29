package JF4_1_LAB_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberFirst = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int numberSecond = Integer.parseInt(scanner.nextLine());


        System.out.println(new DecimalFormat("0.##").format(calculate(numberFirst, operator, numberSecond)));
    }


    public static double calculate(int numberFirst, String operator, int numberSecond) {
        double result = 0.0;
        switch (operator) {
            case "+":
                result = numberFirst + numberSecond;
                break;
            case "-":
                result = numberFirst - numberSecond;
                break;
            case "*":
                result = numberFirst * numberSecond;
                break;
            case "/":
                result = numberFirst * 1.0 / numberSecond;
                break;
        }

        return result;
    }
}
