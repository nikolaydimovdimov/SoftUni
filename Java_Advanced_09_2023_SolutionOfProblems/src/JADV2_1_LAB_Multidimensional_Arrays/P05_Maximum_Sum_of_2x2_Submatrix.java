package JADV2_1_LAB_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05_Maximum_Sum_of_2x2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixNumbers = readMatrix(scanner);
        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0, maxCol = 0;
        for (int r = 0; r < matrixNumbers.length - 1; r++) {
            for (int c = 0; c < matrixNumbers[0].length - 1; c++) {
                readSquareSubMatrix(matrixNumbers, r, c, 2);
                int sum = sumMatrixElements(readSquareSubMatrix(matrixNumbers, r, c, 2));
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = r;
                    maxCol = c;
                }
            }
        }

        for (int[] rows : readSquareSubMatrix(matrixNumbers, maxRow, maxCol, 2)) {

            System.out.println(Arrays.toString(rows).replaceAll("[\\[\\],]",""));
        }
        System.out.println(maxSum);
    }

    private static int[][] readSquareSubMatrix(int[][] matrix, int row, int col, int dim) {
        int[][] subMatrix = new int[dim][dim];
        for (int r = row; r < row + dim; r++) {
            for (int c = col; c < col + dim; c++) {
                subMatrix[r - row][c - col] = matrix[r][c];
            }
        }
        return subMatrix;
    }

    private static int sumMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] rows : matrix) {
            for (int num : rows) {
                sum += num;
            }
        }
        return sum;
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
