package P04LAB_FOR_Loop;

import java.util.Scanner;

public class P07_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (; n > 0; n--) {
            sum += Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}
