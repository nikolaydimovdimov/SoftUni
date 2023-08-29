package P06Ex_Nested_Loops;

import java.util.Scanner;

public class P01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 1;
        boolean stopFlag = false;
        for (int row = 1; row <= number; row++) {
            for (int coll = 1; coll <= row; coll++) {
                System.out.printf("%d ", count);
                count++;
                if (count > number) {
                    stopFlag = true;
                    break;
                }
            }
            System.out.println();
            if (stopFlag) {
                break;
            }
        }
    }
}
