package P05LAB_While_Loop;

import java.util.Scanner;

public class P07_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = 0, minNumber = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            number = Integer.parseInt(input);
            if (number < minNumber) {
                minNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
