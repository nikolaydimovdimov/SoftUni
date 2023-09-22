package JADV2_1_LAB_Multidimensional_Arrays;

import java.util.*;

public class P08_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixNumbers = readMatrix(scanner);
        int[][] newMatrixNumbers = new int[matrixNumbers.length][matrixNumbers[0].length];
        for (int i = 0; i < matrixNumbers.length; i++) {
            for (int j = 0; j < matrixNumbers[0].length; j++) {
                newMatrixNumbers[i][j] = matrixNumbers[i][j];
            }
        }
        int[] wrongValueCoordinates = readArray(scanner);
        int wrongValueRow = wrongValueCoordinates[0];
        int wrongValueColumn = wrongValueCoordinates[1];
        int wrongValue = matrixNumbers[wrongValueRow][wrongValueColumn];
        List<int[]> listWrongNumbers = getWrongNumbersPositions(matrixNumbers, wrongValue);

        for (int[] listWrongNumber : listWrongNumbers) {
            wrongValueRow = listWrongNumber[0];
            wrongValueColumn = listWrongNumber[1];
            newMatrixNumbers[wrongValueRow][wrongValueColumn] = recalculateWrongValue(matrixNumbers, wrongValueRow, wrongValueColumn);
        }
        printMatrix(newMatrixNumbers);
    }

    private static int recalculateWrongValue(int[][] matrix, int rowWrongValue, int colWrongValue) {
        int row = matrix.length;
        int col = matrix[0].length;
        int wrongValue = matrix[rowWrongValue][colWrongValue];
        int newValue = 0;
        if (rowWrongValue - 1 >= 0 && matrix[rowWrongValue - 1][colWrongValue] != wrongValue) {
            newValue += matrix[rowWrongValue - 1][colWrongValue];
        }
        if (colWrongValue - 1 >= 0 && matrix[rowWrongValue][colWrongValue - 1] != wrongValue) {
            newValue += matrix[rowWrongValue][colWrongValue - 1];
        }
        if (rowWrongValue + 1 < row && matrix[rowWrongValue + 1][colWrongValue] != wrongValue) {
            newValue += matrix[rowWrongValue + 1][colWrongValue];
        }
        if (colWrongValue + 1 < col && matrix[rowWrongValue][colWrongValue + 1] != wrongValue) {
            newValue += matrix[rowWrongValue][colWrongValue + 1];
        }
        return newValue;
    }

    private static List<int[]> getWrongNumbersPositions(int[][] matrix, int number) {

        List<int[]> listPositions = new ArrayList<>();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == number) {
                    int[] position = new int[2];
                    position[0] = r;
                    position[1] = c;
                    listPositions.add(position);
                }
            }
        }
        return listPositions;
    }

    private static int[][] readMatrix(Scanner scanner) {
        int r = Integer.parseInt(scanner.nextLine());
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

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row).replaceAll("[\\[\\],]", ""));
        }
    }

}
