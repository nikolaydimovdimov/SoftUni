package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", factorialCalculate(numberOne) * 1.0 / factorialCalculate(numberTwo));

    }

    public static long factorialCalculate(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
