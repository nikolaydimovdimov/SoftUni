package JF3_1_LAB_Arrays;

import java.util.Scanner;

public class P02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbersArr = new int[n];
        for (int i = 0; i < n; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = n; i > 0; i--) {
            System.out.printf("%d ", numbersArr[i - 1]);
        }
    }
}

