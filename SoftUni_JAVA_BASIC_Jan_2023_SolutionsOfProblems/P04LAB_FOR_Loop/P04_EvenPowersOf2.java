package P04LAB_FOR_Loop;

import java.util.Scanner;

public class P04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = 1;
        for (int i = 0; i <= n; i += 2) {
            System.out.println(result);
            result = result * 2 * 2;
        }
    }
}
