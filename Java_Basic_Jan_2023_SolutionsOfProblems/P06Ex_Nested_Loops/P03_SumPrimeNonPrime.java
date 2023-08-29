package P06Ex_Nested_Loops;

import java.util.Scanner;

public class P03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumPrime = 0, sumNonPrime = 0;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean divFlag = false;
            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int divisor = 2; divisor <= number / 2; divisor++) {
                    if (number % divisor == 0) {
                        divFlag = true;
                        break;
                    }
                }
                if (divFlag) {
                    sumNonPrime += number;
                } else {
                    sumPrime += number;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n",sumNonPrime);
    }
}
