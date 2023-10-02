package JADV5_1_LAB_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class P01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] evenNumbers = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(evenNumbers)
                .replaceAll("[\\[\\]]", ""));
        System.out.println(Arrays.toString(Arrays.stream(evenNumbers).sorted().toArray())
                .replaceAll("[\\[\\]]", ""));
    }
}
