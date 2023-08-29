package JF4_2_EXERCISE_Methods;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        printSmallestNUmber(numberOne, numberTwo, numberThree);
    }

    public static void printSmallestNUmber(int n1, int n2, int n3) {
        if (n1 > n2) {
            n1 = n2;
        }
        if (n1 > n3) {
            n1 = n3;
        }
        System.out.println(n1);
    }
}
