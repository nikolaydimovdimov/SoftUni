package JF02_1_LAB_Data_Types_and_Variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        BigDecimal sumBigNumbers = new BigDecimal(0);

        for (int i = 0; i < numbers; i++) {
            BigDecimal bigNumber = new BigDecimal(scanner.nextLine());
            sumBigNumbers = sumBigNumbers.add(bigNumber);
        }
        System.out.println(sumBigNumbers);
    }
}
