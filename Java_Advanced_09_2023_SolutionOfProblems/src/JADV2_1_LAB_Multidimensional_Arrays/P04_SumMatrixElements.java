package JADV2_1_LAB_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixNumbers = readMatrix(scanner);
        int sum = 0;
        for (int[] rows : matrixNumbers) {
            for (int num : rows) {
                sum += num;
            }
        }
        System.out.println(matrixNumbers.length);
        System.out.println(matrixNumbers[0].length);
        System.out.println(sum);
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] dim = readArray(scanner);
        int r = dim[0];
        int[][] mat = new int[r][];
        for (int i = 0; i < r; i++) {
            mat[i] = readArray(scanner);
        }
        return mat;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
