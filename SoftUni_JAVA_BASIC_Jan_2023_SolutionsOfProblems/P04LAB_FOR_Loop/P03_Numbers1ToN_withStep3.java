package P04LAB_FOR_Loop;

import java.util.Scanner;

public class P03_Numbers1ToN_withStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= number; count += 3) {
            System.out.println(count);
        }
    }
}
