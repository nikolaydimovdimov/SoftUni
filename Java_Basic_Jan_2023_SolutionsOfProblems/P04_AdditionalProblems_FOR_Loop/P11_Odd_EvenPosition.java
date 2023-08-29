package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P11_Odd_EvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double number = 0;
        if (n == 0) {
            System.out.printf("OddSum=%.2f,%n", 0.0);
            System.out.printf("OddMin=%s,%n", "No");
            System.out.printf("OddMax=%s,%n", "No");
            System.out.printf("EvenSum=%.2f,%n", 0.0);
            System.out.printf("EvenMin=%s,%n", "No");
            System.out.printf("EvenMax=%s", "No");
        } else if (n == 1) {
            number = Double.parseDouble(scanner.nextLine());
            System.out.printf("OddSum=%.2f,%n", number);
            System.out.printf("OddMin=%.2f,%n", number);
            System.out.printf("OddMax=%.2f,%n", number);
            System.out.printf("EvenSum=%.2f,%n", 0.0);
            System.out.printf("EvenMin=%s,%n", "No");
            System.out.printf("EvenMax=%s", "No");
        } else {
            double oddSum = 0, oddMax = -Double.MAX_VALUE, oddMin = Double.MAX_VALUE,
                    evenSum = 0, evenMax = -Double.MAX_VALUE, evenMin = Double.MAX_VALUE;
            for (int count = 1; count <= n; count++) {
                number = Double.parseDouble(scanner.nextLine());
                if (count % 2 == 1) {
                    oddSum += number;
                    if (number > oddMax) {
                        oddMax = number;
                    }
                    if (number < oddMin) {
                        oddMin = number;
                    }
                } else {
                    evenSum += number;
                    if (number > evenMax) {
                        evenMax = number;
                    }
                    if (number < evenMin) {
                        evenMin = number;
                    }
                }
            }
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}
