package JF4_1_LAB_Methods;

import java.util.Scanner;

public class P01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt((scanner.nextLine()));

        printSignOfNumber(inputNumber);
    }

    public static void printSignOfNumber(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
