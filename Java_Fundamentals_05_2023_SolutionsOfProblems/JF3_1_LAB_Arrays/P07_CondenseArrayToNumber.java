package JF3_1_LAB_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        for (int i = numbersArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                numbersArray[j] += numbersArray[j + 1];
            }
        }
        System.out.println(numbersArray[0]);
    }
}
