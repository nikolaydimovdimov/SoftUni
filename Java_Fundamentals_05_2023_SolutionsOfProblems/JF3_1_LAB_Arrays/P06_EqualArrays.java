package JF3_1_LAB_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfElements = 0, indexOfFirstDifferent = -1;
        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                sumOfElements += firstArray[i];
            } else {
                indexOfFirstDifferent = i;
                break;
            }
        }
        if (indexOfFirstDifferent == -1) {
            System.out.printf("Arrays are identical. Sum: %d", sumOfElements);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", indexOfFirstDifferent);
        }
    }
}
