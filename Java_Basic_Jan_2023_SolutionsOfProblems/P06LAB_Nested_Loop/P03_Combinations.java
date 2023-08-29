package P06LAB_Nested_Loop;

import java.util.Scanner;

public class P03_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        int numberSolutions = 0;
        for (int number1 = 0; number1 <= sum; number1++) {
            for (int number2 = 0; number2 <= sum; number2++) {
                for (int number3 = 0; number3 <= sum; number3++) {
                    if (number1 + number2 + number3 == sum) {
                        numberSolutions++;
                    }
                }
            }
        }
        System.out.println(numberSolutions);
    }
}
