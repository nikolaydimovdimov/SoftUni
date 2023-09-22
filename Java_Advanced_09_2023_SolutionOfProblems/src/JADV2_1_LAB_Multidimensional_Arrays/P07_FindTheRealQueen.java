package JADV2_1_LAB_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07_FindTheRealQueen {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] chessboard = readMatrixSquare(scanner);
        List<int[]> queensPositions = new ArrayList<>();
        boolean isTruePosition;

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (chessboard[r][c].equals("q")) {
                    int[] position = new int[2];
                    position[0] = r;
                    position[1] = c;
                    queensPositions.add(position);
                }
            }
        }
        for (int i = 0; i < queensPositions.size(); i++) {
            isTruePosition = true;
            for (int j = 0; j < queensPositions.size(); j++) {
                if (j == i) continue;
                if (queensPositions.get(i)[0] == queensPositions.get(j)[0]
                        || queensPositions.get(i)[1] == queensPositions.get(j)[1]
                        || (queensPositions.get(i)[0] - queensPositions.get(i)[1]) ==
                        (queensPositions.get(j)[0] - queensPositions.get(j)[1])
                        || (queensPositions.get(i)[0] + queensPositions.get(i)[1]) ==
                        (queensPositions.get(j)[0] + queensPositions.get(j)[1])) {
                    isTruePosition = false;
                    break;
                }
            }
            if (isTruePosition) System.out.println(queensPositions.get(i)[0] + " " + queensPositions.get(i)[1]);
        }

    }


    private static String[][] readMatrixSquare(Scanner scanner) {
        int r = 8;
        String[][] matrix = new String[8][8];
        for (int i = 0; i < r; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static String[] readArray(Scanner scanner) {
        return scanner.nextLine().split(" ");
    }
}
