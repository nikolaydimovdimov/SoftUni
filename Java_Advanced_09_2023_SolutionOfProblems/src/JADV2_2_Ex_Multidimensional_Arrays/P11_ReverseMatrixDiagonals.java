package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int rows = matrix.length;
        int columns = matrix[0].length;

        int currentRow = rows - 1;
        int currentColumn = columns - 1;
        for (int i = 0; i < columns; i++) {
            int r = currentRow;
            int c = currentColumn;
            while (r >= 0 && c < columns) {
                System.out.print(matrix[r][c] + " ");
                r--;
                c++;
            }
            System.out.println();
            currentColumn--;
        }

        currentRow = rows - 2;
        currentColumn = 0;
        for (int i = 0; i < rows; i++) {
            int r = currentRow;
            int c = currentColumn;
            while (r >= 0 && c < columns) {
                System.out.print(matrix[r][c] + " ");
                r--;
                c++;
            }
            System.out.println();
            currentRow--;
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        int r = readArray(scanner)[0];
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
