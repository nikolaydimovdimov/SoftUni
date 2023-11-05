package JOOP_01_2_Working_with_Abstraction_Ex.P05_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readIntegerLine(scanner.nextLine());
        int rows = dimensions[0];
        int columns = dimensions[1];

        int[][] matrix = new int[rows][columns];

        fillMatrix(rows, columns, matrix);

        String command = scanner.nextLine();
        long sumOfStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = readIntegerLine(command);
            int rowJedi = jediPosition[0];
            int columnJedi = jediPosition[1];

            int[] evilPosition = readIntegerLine(scanner.nextLine());
            int rowEvil = evilPosition[0];
            int columnEvil = evilPosition[1];

            evilMove(rowEvil, columnEvil, matrix);


            sumOfStars = jediMove(rowJedi, columnJedi, matrix, sumOfStars);

            command = scanner.nextLine();
        }

        System.out.println(sumOfStars);


    }

    private static long jediMove(int rowJedi, int columnJedi, int[][] matrix, long sum) {
        while (rowJedi >= 0 && columnJedi < matrix[1].length) {
            if (rowJedi < matrix.length && columnJedi >= 0 && columnJedi < matrix[0].length) {
                sum += matrix[rowJedi][columnJedi];
            }

            columnJedi++;
            rowJedi--;
        }
        return sum;
    }

    private static void evilMove(int rowEvil, int columnEvil, int[][] matrix) {
        while (rowEvil >= 0 && columnEvil >= 0) {
            if (rowEvil < matrix.length && columnEvil < matrix[0].length) {
                matrix[rowEvil][columnEvil] = 0;
            }
            rowEvil--;
            columnEvil--;
        }
    }

    private static int[] readIntegerLine(String command) {
        return Arrays.stream(command.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void fillMatrix(int rows, int columns, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
