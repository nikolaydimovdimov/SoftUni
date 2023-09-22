package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int dimension = Integer.parseInt(input[0]);
        String type = input[1];
        int[][] matrix = new int[dimension][dimension];
        int startValue = dimension - 1;
        int endValue = 0;
        int row;

        int counter = 1;
        for (int column = 0; column < dimension; column++) {
            if (type.equals("A")) {
                startValue = 0;
                endValue = dimension - 1;
            } else {
                int saver = startValue;
                startValue = endValue;
                endValue = saver;
            }
            row = startValue;
            while (row >= 0 && row <= dimension - 1) {
                matrix[row][column] = counter;
                counter++;
                if (startValue == 0) {
                    row++;
                } else {
                    row--;
                }
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row).replaceAll("[\\[\\],]", ""));
        }
    }
}
