package JF3_1_LAB_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0, sumOdd = 0;
        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int i : numbersArray) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
