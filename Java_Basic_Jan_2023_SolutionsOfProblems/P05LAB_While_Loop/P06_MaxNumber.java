package P05LAB_While_Loop;

import java.util.Scanner;

public class P06_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = 0, maxNumber = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            number=Integer.parseInt(input);
            if (number > maxNumber) {
                maxNumber = number;
            }
            input = scanner.nextLine();
         }
        System.out.println(maxNumber);
    }
}
