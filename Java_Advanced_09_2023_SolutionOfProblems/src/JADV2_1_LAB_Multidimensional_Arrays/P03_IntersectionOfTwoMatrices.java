package JADV2_1_LAB_Multidimensional_Arrays;

import java.util.Scanner;

public class P03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        String[][] matrix1 = readMatrixString(scanner, row);
        String[][] matrix2 = readMatrixString(scanner, row);
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < matrix1[0].length; c++) {
                if (matrix1[r][c].equals(matrix2[r][c])) {
                    System.out.print(matrix1[r][c]);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    private static String[][] readMatrixString(Scanner scanner, int row) {

        String[][] mat = new String[row][];
        for (int i = 0; i < row; i++) {
            mat[i] = readArrayString(scanner);
        }
        return mat;
    }

    private static String[] readArrayString(Scanner scanner) {
        return scanner.nextLine().split("");
    }

}
