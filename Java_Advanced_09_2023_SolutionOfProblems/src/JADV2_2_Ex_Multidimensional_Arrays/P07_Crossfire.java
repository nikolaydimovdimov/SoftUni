package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.Scanner;

public class P07_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][columns];
        fillMatrix(matrix);
        input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("Nuke")) {
            crossFire(matrix, Integer.parseInt(input[0]), Integer.parseInt(input[1]),
                    Integer.parseInt(input[2]));
            input = scanner.nextLine().split("\\s+");
        }

        printMatrix(matrix);
    }

    private static void fillMatrix(String[][] matrix) {
        int count = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                count++;
                matrix[r][c] = String.valueOf(count);
            }
        }
    }

    private static void crossFire(String[][] matrix, int row, int column, int radius) {
        if (row < 0 || row >= matrix.length || column < 0 || column >= matrix[0].length) {
            return;
        }
        int start = row - radius;
        if (start < 0) start = 0;
        int end = row + radius;
        if (end > matrix.length) end = matrix.length;

        for (int i = start; i < end; i++) {
            matrix[i][column] = " ";
        }

        start = column - radius;
        if (start < 0) start = 0;
        end = column + radius;
        if (end > matrix[0].length) end = matrix[0].length;

        for (int i = start; i < end; i++) {
            matrix[row][i] = " ";
        }
        boolean isThereMarker = true;
        while (isThereMarker) {
            isThereMarker = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j].equals(" ") && j < matrix[i].length - 1 && !matrix[i][j + 1].equals(" ")) {
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = " ";
                        isThereMarker = true;
                    }
                }
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (!matrix[i][j].equals(" ")) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
