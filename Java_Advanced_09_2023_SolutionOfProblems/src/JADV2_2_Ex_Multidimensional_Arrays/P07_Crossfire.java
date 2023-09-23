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

        boolean isThereMarker = false;
        if (column >= 0 && column < matrix[0].length) {

            isThereMarker = true;
            int start = row - radius;
            int end = row + radius;


            for (int i = start; i <= end; i++) {
                if (i >= 0 && i < matrix.length) {
                    matrix[i][column] = " ";
                }
            }
        }
        if (row >= 0 && row < matrix.length) {

            isThereMarker = true;
            int start = column - radius;
            int end = column + radius;


            for (int i = start; i <= end; i++) {
                if (i >= 0 && i < matrix[0].length)
                    matrix[row][i] = " ";
            }
        }
        if (!isThereMarker) return;

        while (isThereMarker) {
            isThereMarker = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j].equals(" ") && !matrix[i][j + 1].equals(" ")) {
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = " ";
                        isThereMarker = true;
                    }
                }
            }
        }

        isThereMarker = true;
        while (isThereMarker) {
            isThereMarker = false;
            for (int i = 0; i < matrix.length - 1; i++) {
                if (matrix[i][0].equals(" ") && !matrix[i + 1][0].equals(" ")) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = " ";
                    }
                    isThereMarker = true;
                }
            }
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String line = "";
            for (int j = 0; j < matrix[0].length; j++) {
                if (!matrix[i][j].equals(" ")) {
                    line += matrix[i][j] + " ";
                }
            }
            if (!line.equals("")) {
                line = line.trim();
                System.out.println(line);
            }
        }
    }
}
