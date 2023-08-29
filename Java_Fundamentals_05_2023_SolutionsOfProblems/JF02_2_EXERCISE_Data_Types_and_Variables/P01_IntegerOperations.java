package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        long result = (long) (firstNumber + secondNumber) / thirdNumber * fourthNumber;
        System.out.println(result);
    }
}
