package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.Scanner;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = readArrayString(scanner);
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);
        String[][] matrix = readMatrixString(scanner, rows);
        input = readArrayString(scanner);
        while (!input[0].equals("END")) {
            if (isCommandValid(input, rows, columns)) {
                swapElements(matrix, input);
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            input = readArrayString(scanner);
        }

    }

    private static void swapElements(String[][] mat, String[] command) {
        int r1 = Integer.parseInt(command[1]);
        int c1 = Integer.parseInt(command[2]);
        int r2 = Integer.parseInt(command[3]);
        int c2 = Integer.parseInt(command[4]);
        String saver = mat[r1][c1];
        mat[r1][c1] = mat[r2][c2];
        mat[r2][c2] = saver;
    }

    private static boolean isCommandValid(String[] command, int rows, int columns) {
        if ((!command[0].equals("swap")) || command.length != 5) return false;
        int r1 = Integer.parseInt(command[1]);
        int c1 = Integer.parseInt(command[2]);
        int r2 = Integer.parseInt(command[3]);
        int c2 = Integer.parseInt(command[4]);
        return r1 >= 0 && r1 < rows && r2 >= 0 && r2 < rows &&
                c1 >= 0 && c1 < columns && c2 >= 0 && c2 < columns;
    }

    private static String[][] readMatrixString(Scanner scanner, int row) {

        String[][] mat = new String[row][];
        for (int i = 0; i < row; i++) {
            mat[i] = readArrayString(scanner);
        }
        return mat;
    }

    private static String[] readArrayString(Scanner scanner) {
        return scanner.nextLine().split(" ");
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            System.out.println(String.join(" ", row));
        }
    }
}
