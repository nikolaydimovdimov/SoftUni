package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumASCII = 0;
        for (int i = 0; i < number; i++) {
            sumASCII += (int) scanner.nextLine().charAt(0);
        }
        System.out.printf("The sum equals: %d", sumASCII);
    }
}
