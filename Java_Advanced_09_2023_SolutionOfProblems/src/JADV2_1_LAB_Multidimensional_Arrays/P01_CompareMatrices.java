package JADV2_1_LAB_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = readMatrix(scanner);
        int[][] matrix2 = readMatrix(scanner);

        System.out.println(isMatrixEqual(matrix1, matrix2) ? "equal" : "not equal");
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
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static boolean isMatrixSame(int[][] mat1, int[][] mat2) {
        return mat1.length == mat2.length && mat1[0].length == mat2[0].length;
    }

    private static boolean isMatrixEqual(int[][] mat1, int[][] mat2) {
        if (!isMatrixSame(mat1, mat2)) return false;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
