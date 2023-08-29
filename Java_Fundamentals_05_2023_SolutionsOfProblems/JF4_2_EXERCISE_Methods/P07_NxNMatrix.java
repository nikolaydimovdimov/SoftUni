package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printNxNMatrix(n);

    }

    public static void printNxNMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", n);
            }
            System.out.println();
        }
    }

}
