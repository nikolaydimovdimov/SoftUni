package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numbers; i++) {
            System.out.printf("%d -> ", i);
            int sumOfDigits = 0;
            int j = i;
            while (j > 0) {
                sumOfDigits += (j % 10);
                j /= 10;
            }
            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}


