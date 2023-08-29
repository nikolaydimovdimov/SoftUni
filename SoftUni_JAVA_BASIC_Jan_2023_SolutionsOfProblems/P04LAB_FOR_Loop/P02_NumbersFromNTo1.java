package P04LAB_FOR_Loop;

import java.util.Scanner;

public class P02_NumbersFromNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (; number > 0; number--) {
            System.out.println(number);
        }
    }
}
