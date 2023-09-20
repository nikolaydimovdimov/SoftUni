package JADV2_1_LAB_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixNumbers = readMatrix(scanner);
        int wantedNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int r = 0; r < matrixNumbers.length; r++) {
            for (int c = 0; c < matrixNumbers[0].length; c++) {
                if (matrixNumbers[r][c] == wantedNumber) {
                    isFound = true;
                    System.out.println(r + " " + c);
                }
            }
        }
        if (!isFound) System.out.println("not found");
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
}
