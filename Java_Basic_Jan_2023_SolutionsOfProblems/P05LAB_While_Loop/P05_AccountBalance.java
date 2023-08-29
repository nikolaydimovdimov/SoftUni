package P05LAB_While_Loop;

import java.util.Scanner;

public class P05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        double inputNumber = 0, sum = 0;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("NoMoreMoney")) {
                break;
            }
            inputNumber = Double.parseDouble(input);
            if (inputNumber < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += inputNumber;
            System.out.printf("Increase: %.2f%n", inputNumber);
        }
        System.out.printf("Total: %.2f", sum);
    }
}
