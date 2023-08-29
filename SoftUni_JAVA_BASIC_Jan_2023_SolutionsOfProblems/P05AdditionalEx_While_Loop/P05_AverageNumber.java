package P05AdditionalEx_While_Loop;

import java.util.Scanner;

public class P05_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int count = 0; count < number; count++) {
            sum += Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("%.2f", sum * 1.0 / number);
    }
}
