package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractIntNumbers(addIntNumbers(numberOne, numberTwo), numberThree));

    }

    public static int addIntNumbers(int nOne, int nTwo) {
        return nOne + nTwo;
    }

    public static int subtractIntNumbers(int nOne, int nTwo) {
        return nOne - nTwo;
    }
}
