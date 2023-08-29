package P05LAB_While_Loop;

import java.util.Scanner;

public class P03_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum < number) {
            sum += Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}
