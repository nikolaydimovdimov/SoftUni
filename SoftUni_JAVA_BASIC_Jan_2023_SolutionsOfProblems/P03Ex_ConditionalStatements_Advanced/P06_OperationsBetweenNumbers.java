package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int result = number1 + number2;
                System.out.printf("%d %s %d = %d - ", number1, operator, number2, result);
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case "-":
                result = number1 - number2;
                System.out.printf("%d %s %d = %d - ", number1, operator, number2, result);
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case "*":
                result = number1 * number2;
                System.out.printf("%d %s %d = %d - ", number1, operator, number2, result);
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case "/":
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    System.out.printf("%d %s %d = %.2f", number1, operator, number2, number1 * 1.0 / number2);
                }
                break;
            case "%":
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    System.out.printf("%d %s %d = %d", number1, operator, number2, number1 % number2);
                }
                break;
        }
    }
}
