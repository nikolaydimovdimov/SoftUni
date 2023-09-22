package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int degrees = Integer.parseInt(command.substring(7, command.length() - 1));
        degrees /= 90;
        degrees %= 4;

        List<String> inputsList = new ArrayList<>();
        String input = scanner.nextLine();
        int maxLength = 0;

        while (!input.equals("END")) {
            inputsList.add(input);
            if (input.length() > maxLength) maxLength = input.length();
            input = scanner.nextLine();
        }

        char[][] matrix = new char[inputsList.size()][maxLength];
        fillMatrix(matrix, inputsList);

        if (degrees == 1) {
            char[][] newMatrix = new char[maxLength][inputsList.size()];
            rotateMatrix90(matrix, newMatrix);
            printCharMatrix(newMatrix);
        } else if (degrees == 2) {
            char[][] newMatrix = new char[inputsList.size()][maxLength];
            rotateMatrix180(matrix, newMatrix);
            printCharMatrix(newMatrix);
        } else if (degrees == 3) {
            char[][] newMatrix = new char[maxLength][inputsList.size()];
            rotateMatrix270(matrix, newMatrix);
            printCharMatrix(newMatrix);
        } else if (degrees == 0) {
            char[][] newMatrix = matrix;
            printCharMatrix(newMatrix);
        }
    }

    private static void rotateMatrix90(char[][] matrix, char[][] newMatrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newMatrix[j][i] = matrix[r - i - 1][j];
            }
        }
    }

    private static void rotateMatrix180(char[][] matrix, char[][] newMatrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newMatrix[i][c - j - 1] = matrix[r - i - 1][j];
            }
        }
    }

    private static void rotateMatrix270(char[][] matrix, char[][] newMatrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newMatrix[c - j - 1][i] = matrix[i][j];
            }
        }
    }

    private static void fillMatrix(char[][] mat, List<String> inList) {
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                if (c < inList.get(r).length()) {
                    mat[r][c] = inList.get(r).charAt(c);
                } else {
                    mat[r][c] = ' ';
                }
            }
        }
    }

    private static void printCharMatrix(char[][] matrix) {
        for (char[] rows : matrix) {
            for (char el : rows) {
                System.out.print(el);
            }
            System.out.println();
        }
    }
}
