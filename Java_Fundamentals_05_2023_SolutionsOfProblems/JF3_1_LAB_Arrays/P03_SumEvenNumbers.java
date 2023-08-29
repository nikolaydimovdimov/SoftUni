package JF3_1_LAB_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sumEven = 0;

        for (int j : numbersArr) {
            if (j % 2 == 0) {
                sumEven += j;
            }
        }
        System.out.println(sumEven);
    }
}
