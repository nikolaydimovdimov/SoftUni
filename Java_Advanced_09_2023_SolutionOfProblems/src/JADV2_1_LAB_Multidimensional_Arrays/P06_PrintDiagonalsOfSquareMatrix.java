package JADV2_1_LAB_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixNumbers = readMatrixSquare(scanner);
        System.out.println(Arrays.toString(getFirstDiagonalSquareMatrix(matrixNumbers))
                .replaceAll("[\\[\\],]", ""));
        System.out.println(Arrays.toString(getSecondDiagonalSquareMatrix(matrixNumbers))
                .replaceAll("[\\[\\],]", ""));
    }

    private static int[][] readMatrixSquare(Scanner scanner) {
        int r = Integer.parseInt(scanner.nextLine());
        int[][] mat = new int[r][r];
        for (int i = 0; i < r; i++) {
            mat[i] = readArray(scanner);
        }
        return mat;
    }

    private static int[] getFirstDiagonalSquareMatrix(int[][] matrix) {
        int size = matrix.length;
        int[] firstDiagonal = new int[size];
        for (int i = 0; i < size; i++) {
            firstDiagonal[i] = matrix[i][i];
        }
        return firstDiagonal;
    }

    private static int[] getSecondDiagonalSquareMatrix(int[][] matrix) {
        int size = matrix.length;
        int[] secondDiagonal = new int[size];
        for (int i = 0; i < size; i++) {
            secondDiagonal[i] = matrix[size - i - 1][i];
        }
        return secondDiagonal;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
