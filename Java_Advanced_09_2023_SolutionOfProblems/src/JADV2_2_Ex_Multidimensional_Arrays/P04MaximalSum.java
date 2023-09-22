package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumMax = Integer.MIN_VALUE;
        int rowMax = 0;
        int columnMax = 0;
        int[][] matrix = readMatrix(scanner);
        for (int r = 0; r < matrix.length - 2; r++) {
            for (int c = 0; c < matrix[r].length - 2; c++) {
                int sum = 0;
                for (int i = r; i < r + 3; i++) {
                    for (int j = c; j < c + 3; j++) {
                        sum += matrix[i][j];
                    }
                }
                if (sum > sumMax) {
                    sumMax = sum;
                    rowMax = r;
                    columnMax = c;
                }
            }
        }
        System.out.println("Sum = " + sumMax);
        printMatrix3x3(matrix, rowMax, columnMax);
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
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void printMatrix3x3(int[][] matrix, int row, int col) {
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
