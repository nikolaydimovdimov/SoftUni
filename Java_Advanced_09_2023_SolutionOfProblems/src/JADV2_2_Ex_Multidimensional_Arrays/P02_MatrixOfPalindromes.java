package JADV2_2_Ex_Multidimensional_Arrays;

import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rowDim = Integer.parseInt(input[0]);
        int columnDim = Integer.parseInt(input[1]);
        char symbol = 'a';
        String[][] matrixPal = new String[rowDim][columnDim];
        for (int row = 0; row < rowDim; row++) {
            for (int col = 0; col < columnDim; col++) {
                matrixPal[row][col] = symbol + String.valueOf((char) (symbol + col)) + symbol;
//                matrixPal[row][col] ="" + symbol + ((char) (symbol + col)) + symbol;
            }
            symbol++;
        }
        printMatrix(matrixPal);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            System.out.println(String.join(" ", row));
        }
    }
}
