package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumFirstDiagonal += matrix[i][i];
            sumSecondDiagonal += matrix[i][matrix.length - i - 1];
        }
        System.out.println(Math.abs(sumFirstDiagonal - sumSecondDiagonal));

    }

    private static int[][] readMatrix(Scanner scanner) {
        int r = Integer.parseInt(scanner.nextLine());
        int[][] mat = new int[r][];
        for (int i = 0; i < r; i++) {
            mat[i] = readArray(scanner);
        }
        return mat;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
